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
public enum EnumMenuItem implements Strategy {

    TESTE {
        @Override
        public void actionPerformed(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getActionFromMenuItem() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
}