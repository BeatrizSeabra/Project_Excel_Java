/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ui.ctrl;

import csheets.CleanSheets;
import csheets.ext.Extension;
import csheets.ext.ExtensionManager;
import csheets.ui.ExtensionsManagerWindow;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.Action;
import static javax.swing.Action.ACCELERATOR_KEY;
import static javax.swing.Action.ACTION_COMMAND_KEY;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.TransferHandler;

/**
 *
 * @author Oleg
 */
public class ExtensionsManagerAction extends BaseAction{
        
    
        /** The user interface controller */
	private UIController uiController;
        
        private CleanSheets app;

	public  ExtensionsManagerAction(CleanSheets app, UIController uiController) {
            this.uiController = uiController;
            this.app = app;                      
	}

	protected String getName() {
		return "Extensions Manager";
	}

	protected void defineProperties() {
            //putValue(MNEMONIC_KEY, KeyEvent.VK_C);
            //putValue(ACTION_COMMAND_KEY, (String)TransferHandler.getPasteAction().getValue(Action.NAME));
            putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/toolbar.gif")));
	}

	public void actionPerformed(ActionEvent e) {
           try {
                        ExtensionsManagerWindow emw = new ExtensionsManagerWindow(app, uiController);
                        emw.setVisible(true);
                        emw.setSize(500, 350);
                        emw.setResizable(true);
                        emw.setLocationRelativeTo(null);
                        
		} catch (Exception ex) {
			// para ja ignoramos a excepcao
                }
            
           /* setEnabled(true);
            ExtensionManager instance = ExtensionManager.getInstance();
        Extension[] extensions = instance.getExtensions();
        JFrame jframe = new JFrame("Extensions Manager2");
        JPanel jPanel1 = new JPanel(new GridLayout(extensions.length/2, 2, 30, 5));
        jframe.add(jPanel1);
        for(Extension ex : extensions){
            if(!ex.getName().equalsIgnoreCase("Extensions Manager2")){
                jPanel1.add(new Checkbox(ex.getName(), null, true));
            }                    
        }*/
    }
	

	protected boolean requiresModification() {
		return true;
	}
    
}
