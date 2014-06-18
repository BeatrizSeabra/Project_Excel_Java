package csheets.ext.editMacro.compiler;

import csheets.core.IllegalValueTypeException;
import csheets.core.Value;
import csheets.core.formula.Formula;
import csheets.core.formula.util.CircularReferenceException;
import csheets.core.formula.util.CircularReferenceFinder;
import csheets.core.formula.util.ExpressionVisitor;
import csheets.core.formula.util.ExpressionVisitorException;
import java.util.ArrayList;

/**
 *
 * @author i120388
 */
public class Macro{

    private ArrayList<Formula> formulas;

    public Macro() {
    }

    public Macro(ArrayList<Formula> formulas) {
        this.formulas = formulas;
    }


    public ArrayList<Value> evaluates() throws IllegalValueTypeException {
        ArrayList<Value>value=new ArrayList<>();
        
        for (Formula formula : formulas) {
            if (!formula.hasCircularReference()) {
                value.add(formula.getExpression().evaluate());
            } else {
                value.add(new Value(new CircularReferenceException(formula)));
            }
        }
        return null;
    }

}
