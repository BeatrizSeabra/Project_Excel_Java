/*
 * Copyright (c) 2005 Einar Pehrson <einar@pehrson.nu>.
 *
 * This file is part of
 * CleanSheets - a spreadsheet application for the Java platform.
 *
 * CleanSheets is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * CleanSheets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CleanSheets; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package csheets.core.formula.lang;

import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionParameter;
import csheets.core.formula.compiler.ExcelExpressionCompiler;
import csheets.core.formula.compiler.FormulaCompilationException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A Function that receives a String containing an expression, and returns the result of that expression
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
public class Eval implements Function {

	/** The only parameter: a string */
	public static final FunctionParameter[] parameters = new FunctionParameter[] {
		new FunctionParameter(Value.Type.TEXT, "Term", false,
			"A String to be included in Eval")
	};

	/**
	 * Creates a new instance of the Eval function.
	 */
	public Eval() {}

	public String getIdentifier() {
		return "EVAL";
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