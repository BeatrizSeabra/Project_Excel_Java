/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.core.formula.lang;

import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionParameter;

/**
 *
 * @author Miguel
 */
public class WhileDo implements Function {

    public static final FunctionParameter[] parameters = new FunctionParameter[]{
        new FunctionParameter(Value.Type.BOOLEAN, "Condition", false,
        "A condition to evaluate before proceeding"),
        new FunctionParameter(Value.Type.UNDEFINED, "Loop", false,
        "A value to return if the condition was met"),};

    @Override
    public String getIdentifier() {
        return "WhileDo";
    }

    @Override
    public Value applyTo(Expression[] args) throws IllegalValueTypeException {

        String value = "";

        while (args[0].evaluate().toBoolean()) {
            value = args[1].evaluate().toString();
        }

        if (value.isEmpty()) {
            return new Value();
        } else {
            return new Value(value);
        }
    }

    @Override
    public FunctionParameter[] getParameters() {
        return parameters;
    }

    @Override
    public boolean isVarArg() {
        return false;
    }

}
