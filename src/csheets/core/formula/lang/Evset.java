/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.core.formula.lang;

import csheets.CleanSheets;
import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.Expression;
import csheets.core.formula.Function;
import csheets.core.formula.FunctionParameter;
import csheets.ext.logfile.AtributeFormula;
import csheets.ui.ctrl.UIController;

/**
 * A function that emulates the if-then-else statement.
 *
 * @author Einar Pehrson
 */
public class Evset implements Function {

    /**
     * The function's two parameters: Event and formula
     */
    public static final FunctionParameter[] parameters = new FunctionParameter[] {
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
                String funcao="", evento="", formula="";
                for (Expression expression : arguments) {
                funcao=arguments[0].evaluate().toText();//Corresponde ao Evento supostamente
                if(funcao.contains(",")){
                String[] funcaoS=funcao.split(",");
                evento=funcaoS[0];
                formula = funcaoS[1];
                }else{
                       //Escrever mensagem
                }
                }
                AtributeFormula a = new AtributeFormula(evento,formula);
                //UIController uiController = new UIController(a.cs);
                //uiController.events.add(a);
                return new Value(formula);

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
//Ver se isto funciona.



	

	

	
