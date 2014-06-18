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
    private Value value;

    public TemporaryVariable(String varName, Value value) {
        this.varName = varName;
        this.value = value;
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
    
    
}
