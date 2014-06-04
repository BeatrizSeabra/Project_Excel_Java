/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.image.ui;

import csheets.CleanSheets;
import csheets.ui.ctrl.BaseAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nélson
 */
class InsertImageAction extends BaseAction {
    private JLabel imageLabel;
    protected UIController uiController;
    public InsertImageAction(UIController uiController) {
    }
    
    protected String getName() {
	return "Insert Image";
    }

    protected void defineProperties() {
        setEnabled(true);
        putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/jpg.png")));
	}


    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
            final ImageIcon image=new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
            imageLabel= new JLabel(image);
            imageLabel.setBounds(15, 225,image.getIconWidth(),image.getIconHeight());
           
        }
    }
    
}
