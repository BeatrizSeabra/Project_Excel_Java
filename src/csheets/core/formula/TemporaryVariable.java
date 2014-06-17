/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.core.formula;

import csheets.core.IllegalValueTypeException;
import csheets.core.Spreadsheet;
import csheets.core.Value;
import csheets.core.formula.util.ExpressionVisitor;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public class TemporaryVariable implements Expression{
    
    private String varName;
    private Spreadsheet spreadsheet;
    private Value value;

    public TemporaryVariable(String varName, Spreadsheet spreadsheet, Value value) {
        this.varName = varName;
        this.spreadsheet = spreadsheet;
        this.value = value;
    }

    @Override
    public Value evaluate() throws IllegalValueTypeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object accept(ExpressionVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
