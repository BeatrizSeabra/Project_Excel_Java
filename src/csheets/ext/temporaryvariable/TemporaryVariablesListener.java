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
 * A listener interface for receiving notification every time a
 * temporary variable is added or updated.
 * @author Diogo Moreira (1120339)
 */


public interface TemporaryVariablesListener extends EventListener{
    
    /**
     * Invoked when a temporary variable is added or updated
     * @param temporaryVariable 
     */
    public void variableCreatedOrUpdated(ArrayList<TemporaryVariable> temporaryVariable);
}
