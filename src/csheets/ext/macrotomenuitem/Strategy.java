/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.macrotomenuitem;

import java.awt.event.ActionEvent;

/**
 *
 * @author 1090675 - Tiago Pereira
 */
public interface Strategy {
    
    public void actionPerformed(ActionEvent event);
    
    public Object getActionFromMenuItem();
    
}
