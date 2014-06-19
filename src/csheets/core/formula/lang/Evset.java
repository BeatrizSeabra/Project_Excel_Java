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
import csheets.ext.logfile.WriteLogFile;

/**
 * A function that atribute a formula to event cells.
 *
 * @author Einar Pehrson
 */
public class Evset implements Function {

    /**
     * The function's one parameters: Event and formula on the same
     */
    public static final FunctionParameter[] parameters = new FunctionParameter[]{
        new FunctionParameter(Value.Type.UNDEFINED, "Event", false, "The event that pretend to assign the function"),
        //new FunctionParameter(Value.Type.TEXT, "Formula", false, "The formula to be assign to the cell event")
    };

    /**
     * Creates a new instance of the Evset function.
     */
    public Evset() {
    }

    @Override
    public String getIdentifier() {
        return "EVSET";
    }

    @Override
    public Value applyTo(Expression[] arguments) throws IllegalValueTypeException {
        String funcao = "", evento = "", formula = "";
        for (Expression expression : arguments) {
            funcao = arguments[0].evaluate().toText();
            if (funcao.contains(",")) {
                String[] funcaoS = funcao.split(",");
                evento = funcaoS[0];
                formula = funcaoS[1];
            } 
        }
       WriteLogFile.writeLogFile(evento);
      
        return new Value(formula);

    }

    @Override
    public FunctionParameter[] getParameters() {
        return parameters;
    }

    @Override
    public boolean isVarArg() {
        return true;
    }
}
