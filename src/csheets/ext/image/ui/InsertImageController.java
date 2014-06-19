package csheets.ext.image.ui;

import csheets.ui.FileChooser;
import csheets.ui.ctrl.UIController;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Tiago
 */

public class InsertImageController {
    
	/** The user interface controller */
	private UIController uiController;
        
	/**
	 * Creates a new game menu controller.
	 * @param uiController the user interface controller
	 */
	public InsertImageController(UIController uiController) {
		this.uiController = uiController;
	}
        
        /**
         * @return Returns the selected image
         */
        public BufferedImage OpenImage(){
            BufferedImage img;
            Properties properties = new Properties();
            properties.setProperty("filetype0.extension", "jpg");
            properties.setProperty("filetype0.description", "JPG Image File (*.jpg)");
            do{
                FileChooser fileChooser= new FileChooser(null, properties);
                File file= fileChooser.getFileToOpen();

                try {
                    img = ImageIO.read(file);
                    return img;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error - Error Loading the Image", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }while(true);
        }
}
