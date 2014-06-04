/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat.ui;

import csheets.CleanSheets;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;
 
/**
 *
 * @author i121228
 */
public class ChatAction extends BaseAction{
    private UIChat chat;
	/** The user interface controller */
	protected UIController uiController;

	/**
	 * Creates a new action.
	 * @param uiController the user interface controller
	 */
	public ChatAction(UIController uiController) {
		this.uiController = uiController;
	}

	protected String getName() {
		return "Chat";
	}

	protected void defineProperties() {
		setEnabled(true);
	}

	public void actionPerformed(ActionEvent event) {
                chat= new UIChat();
                chat.setVisible(true);
		
	}
}
