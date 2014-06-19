package csheets.ext.editMacro.compiler;

import csheets.core.Cell;
import csheets.core.IllegalValueTypeException;
import csheets.core.formula.Expression;
import csheets.core.formula.compiler.FormulaCompilationException;
import java.util.ArrayList;

/**
 *
 * @author i120388
 */
public class Macro {

    private String source;
    private Cell cell;
    MacroCompiler compile = new MacroCompiler();

    public Macro(Cell cell, String source) throws FormulaCompilationException {
        this.cell = cell;
        this.source = source;

        compile.compile(cell, source);
    }

    public String getName() {
        return compile.getName();
    }

    private ArrayList<Expression> getExpressions() {
        return compile.getExpressions();
    }

    public String results() throws IllegalValueTypeException {
        String[] resultado = source.split("\n");
        String result = "";
        
        ArrayList<Expression>exp=getExpressions();
        
        int aux=0;
        for (int i = 1; i <resultado.length-1; i++) {
            result+=resultado[i]+" = "+exp.get(aux).evaluate().toString()+"\n";
            aux++;
        }
        
        return result;
    }
}
