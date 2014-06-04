/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ui.ctrl;

import csheets.ui.FileChooser;
import java.awt.event.ActionEvent;

/**
 *
 * @author 1090675
 */
public class FindWorkbooksFilesAction extends BaseAction {

    /** The text to display in the about dialog */
	private String text;
    
    @Override
    protected String getName() {
        return "Find Workbooks Files";        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        FileChooser fc = new FileChooser(null,null);
                        fc.addChoosableFileFilter(null);
                        fc.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY);                        
                        fc.addChoosableFileFilter(null);
                        fc.showDialog(null, null);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
