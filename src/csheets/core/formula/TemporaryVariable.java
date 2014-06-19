/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.core.formula;

import csheets.core.Cell;
import csheets.core.IllegalValueTypeException;
import csheets.core.Spreadsheet;
import csheets.core.Value;
import csheets.core.formula.util.ExpressionVisitor;

/**
 * A temporary value(name, value and spreadsheet(needed to update spreadsheet lists in some methods))
 * @author Diogo Moreira (1120339)
 */
public class TemporaryVariable implements Expression{
    
    private String varName;
    private Value value;
    private Spreadsheet spreadsheet;

    public TemporaryVariable(String varName, Value value, Spreadsheet spreadsheet) {
        this.varName = varName;
        this.value = value;
        this.spreadsheet=spreadsheet;
    }

    @Override
    public Value evaluate() throws IllegalValueTypeException {
        return this.value;
    }

    @Override
    public Object accept(ExpressionVisitor visitor) {
        return visitor.visitTemporaryVariable(this);
    }

    public String getVarName() {
        return varName;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    
    public Value getValue() {
        return value;
    }

    public Spreadsheet getSpreadsheet() {
        return spreadsheet;
    }

    
    
}
