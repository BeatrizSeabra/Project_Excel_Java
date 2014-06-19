package csheets.ext.editMacro.compiler;

import csheets.core.Cell;
import csheets.core.IllegalValueTypeException;
import csheets.core.SpreadsheetImpl;
import csheets.core.Value;
import csheets.core.formula.*;
import csheets.core.formula.compiler.ExpressionCompiler;
import csheets.core.formula.compiler.FormulaCompilationException;
import csheets.core.formula.lang.*;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author i120388
 */
public class MacroCompiler implements ExpressionCompiler, Serializable {

    public static final char MACRO_STARTER = 'm';

    private ArrayList<Expression> expressions = new ArrayList<>();

    public MacroCompiler() {
    }

    @Override
    public Expression compile(Cell cell, String source) throws FormulaCompilationException {
        // Creates the lexer and parser
        ANTLRStringStream input = new ANTLRStringStream(source);

        // create the buffer of tokens between the lexer and parser 
        MacroLexer lexer = new MacroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MacroParser parser = new MacroParser(tokens);

        CommonTree tree = null;

        try {
            // Attempts to match an expression
            tree = (CommonTree) parser.macro().getTree();

        } catch (RecognitionException e) {
            //String message="Fatal recognition exception " + e.getClass().getName()+ " : " + e;
            String message = parser.getErrorMessage(e, parser.tokenNames);
            throw new FormulaCompilationException("At (" + e.line + ";" + e.charPositionInLine + "): " + message);
        } catch (Exception e) {
            String message = "Other exception : " + e.getMessage();
            throw new FormulaCompilationException(message);
        }

        for (int i = 4; i < tree.getChildCount() - 2; i++) {
            if (tree.getChild(i).getChildCount() != 0) {
                expressions.add(convert(cell, tree.getChild(i)));
            }
        }

        // Converts the expression and returns it
        return null;
    }

    protected Expression convert(Cell cell, Tree node) throws FormulaCompilationException {
        // System.out.println("Converting node '" + node.getText() + "' of tree '" + node.toStringTree() + "' with " + node.getNumberOfChildren() + " children.");
//		if(node.getType()==MacroLexer.SEMI){
//                    convert(cell,node.getChild(1));
//                }
        if (node.getChildCount() == 0) {
            try {
                switch (node.getType()) {
                    case MacroLexer.NUMBER:
                        return new Literal(Value.parseNumericValue(node.getText()));
                    case MacroLexer.STRING:
                        return new Literal(Value.parseValue(node.getText(), Value.Type.BOOLEAN, Value.Type.DATE));
                    case MacroLexer.CELL_REF:
                        return new CellReference(cell.getSpreadsheet(), node.getText());
                    case MacroLexer.VARNAME:
                        return ((SpreadsheetImpl) cell.getSpreadsheet()).getTemporaryVariable(node.getText());
//					case FormulaParserTokenTypes.NAME:
						/* return cell.getSpreadsheet().getWorkbook().
                     getRange(node.getText()) (Reference)*/
                }
            } catch (ParseException e) {
                throw new FormulaCompilationException(e);
            }
        }

        // Convert function call
        Function function = null;
        try {
            function = Language.getInstance().getFunction(node.getText());
        } catch (UnknownElementException e) {
        }

        if (function != null) {
            List<Expression> args = new ArrayList<Expression>();
            Tree child = node.getChild(0);
            if (child != null) {
                for (int nChild = 0; nChild < node.getChildCount(); ++nChild) {
                    args.add(convert(cell, child));
                }
            }
            Expression[] argArray = args.toArray(new Expression[args.size()]);
            return new FunctionCall(function, argArray);
        }

        if (node.getChildCount() == 1) // Convert unary operation
        {
            return new UnaryOperation(
                    Language.getInstance().getUnaryOperator(node.getText()),
                    convert(cell, node.getChild(0))
            );
        } else if (node.getChildCount() == 2) {
            // Convert binary operation
            BinaryOperator operator = Language.getInstance().getBinaryOperator(node.getText());
            if (operator instanceof RangeReference) {
                return new ReferenceOperation(
                        (Reference) convert(cell, node.getChild(0)),
                        (RangeReference) operator,
                        (Reference) convert(cell, node.getChild(1))
                );
            } else if (operator instanceof Attribution) {
                try {

                    if (node.getChild(0).getText().matches("@[a-zA-Z0-9]+")) { //Tests if the attribution is being made to a temporary variable 
                        Value value = convert(cell, node.getChild(1)).evaluate();
                        TemporaryVariable temporaryVariable = new TemporaryVariable(node.getChild(0).getText(), value, cell.getSpreadsheet());
                        ((SpreadsheetImpl) cell.getSpreadsheet()).addOrUpdateTemporaryVariable(temporaryVariable);
                    } else { //Attribution to a Cell Reference
                        //crias uma referencia para a cell
                        CellReference cellR = new CellReference(cell.getSpreadsheet(), node.getChild(0).getText());
                        //buscar a cell,atraves da referencia
                        Cell cellToAttribute = cellR.getCell();
                        //vou buscar a expressao que se encontra a direita do :=
                        Expression exp = convert(cellToAttribute, node.getChild(1));
                        //colocaquei na cell o resultado da expressao anterior
                        cellToAttribute.setContent(exp.evaluate().toString());
                        // se o operator for o da atribuicao entao
                        return new BinaryOperation((Reference) convert(cell, node.getChild(0)), operator, convert(cell, node.getChild(1)));
                    }

                } catch (ParseException e) {
                    throw new FormulaCompilationException(e);
                } catch (IllegalValueTypeException ex) {
                    throw new FormulaCompilationException(ex);
                }

            }
            return new BinaryOperation(
                    convert(cell, node.getChild(0)),
                    operator,
                    convert(cell, node.getChild(1))
            );
        } else // Shouldn't happen
        {
            throw new FormulaCompilationException();
        }
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public String getName(String source) throws FormulaCompilationException {
        // Creates the lexer and parser
        ANTLRStringStream input = new ANTLRStringStream(source);

        // create the buffer of tokens between the lexer and parser 
        MacroLexer lexer = new MacroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MacroParser parser = new MacroParser(tokens);

        CommonTree tree = null;

        try {
            // Attempts to match an expression
            tree = (CommonTree) parser.macro().getTree();

        } catch (RecognitionException e) {
            //String message="Fatal recognition exception " + e.getClass().getName()+ " : " + e;
            String message = parser.getErrorMessage(e, parser.tokenNames);
            throw new FormulaCompilationException("At (" + e.line + ";" + e.charPositionInLine + "): " + message);
        } catch (Exception e) {
            String message = "Other exception : " + e.getMessage();
            throw new FormulaCompilationException(message);
        }

        /*nome da macro*/
        String name = tree.getChild(1).getText();
        // Converts the expression and returns it
        return name;
    }

    @Override
    public char getStarter() {
        return MACRO_STARTER;
    }

}
