/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable;

import csheets.core.formula.TemporaryVariable;
import java.util.ArrayList;
import java.util.EventListener;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public interface TemporaryVariablesListener extends EventListener{
    
    public void variableCreatedOrUpdated(ArrayList<TemporaryVariable> temporaryVariable);
}
