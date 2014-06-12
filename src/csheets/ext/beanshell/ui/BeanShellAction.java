package csheets.ext.beanshell.ui;

import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;


/**
 *
 * @author Fabio Carvalho 1121228
 */
public class BeanShellAction extends BaseAction{
    
     
    /** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public BeanShellAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "BeanShell";
	}

	

        @Override
        public void actionPerformed(ActionEvent e) {
            UIBeanShell uiBeanShell = new UIBeanShell();

        }
    
    
}
