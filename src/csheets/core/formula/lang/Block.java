/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.core.formula.lang;

/**
 *
 * @author Pedro Rosário
 */

import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionParameter;
import csheets.core.formula.compiler.ExcelExpressionCompiler;
import csheets.core.formula.compiler.FormulaCompilationException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Block implements Function {

	/** The only parameter: a string */
	public static final FunctionParameter[] parameters = new FunctionParameter[] {
		new FunctionParameter(Value.Type.TEXT, "Term", false,
			"A String to be included in Block")
	};

	
	public Block(){}
        
	public String getIdentifier() {
		return "Block";
	}

	public Value applyTo(Expression[] arguments) throws IllegalValueTypeException {
		String param="";Expression exp=null;
                for (Expression expression : arguments) {
			Value value = expression.evaluate();
			if (value.getType() == Value.Type.TEXT) {
				param = value.toString();
			} else 	throw new IllegalValueTypeException(value, Value.Type.TEXT);
		}
                param = '=' + param;
                ExcelExpressionCompiler express = new ExcelExpressionCompiler();
                try {
                      exp = express.compile(null, param);
                    } catch (FormulaCompilationException ex) {
                         Logger.getLogger(Eval.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return new Value(exp.evaluate().toString());
                
        }
        
	public FunctionParameter[] getParameters() {
		return parameters;
	}

	public boolean isVarArg() {
		return false;
	}
}
