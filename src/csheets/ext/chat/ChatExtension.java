/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.chat;

import csheets.ext.Extension;
import csheets.ext.chat.ui.UIExtensionChat;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;

/**
 *
 * @author i121228
 */
public class ChatExtension extends Extension {
    
    
    public static final String NAME = "Chat";
    
    
    public ChatExtension() {
		super(NAME);
	}
    
    public UIExtension getUIExtension(UIController uiController) {
		return new UIExtensionChat(this, uiController);
	}
}
