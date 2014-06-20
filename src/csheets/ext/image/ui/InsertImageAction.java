/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csheets.ext.image.ui;

import csheets.CleanSheets;
import csheets.core.Address;
import csheets.core.Cell;
import csheets.ui.Frame;
import csheets.ui.ctrl.FocusOwnerAction;
import csheets.ui.ctrl.UIController;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Nélson e Tiago
 */
class InsertImageAction extends FocusOwnerAction {

    protected UIController uiController;
    private String largura;
    private String altura;
    private String posicao;

    public InsertImageAction(UIController uiController) {
        this.uiController = uiController;
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
        BufferedImage image = OpenImage();
        ImageIcon n = new ImageIcon(image);
        JLabel imageLabel = new JLabel(n);
        showImage(imageLabel,n,image);
        

    }

    public BufferedImage OpenImage() {
        InsertImageController ImageController = new InsertImageController(this.uiController);
        return ImageController.OpenImage();
    }

    private void showImage(JLabel imageLabel,ImageIcon img,BufferedImage bi) {
        Frame frame = (Frame) focusOwner.getTopLevelAncestor();
        Address i = this.uiController.getActiveCell().getAddress();
        InsertImage dialog = new InsertImage(frame, false, imageLabel, i, img,bi,uiController);
        dialog.setBounds(i.getRow() * 30 + 100, i.getColumn() * 20 + 100, 90, 40);

    }


//    {
//        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg");
//        chooser.setFileFilter(filter);
//        int returnVal = chooser.showOpenDialog(null);
//        if(returnVal == JFileChooser.APPROVE_OPTION) {
//            System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
////            final ImageIcon image=new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
////            imageLabel= new JLabel(image);
////            imageLabel.setBounds(15, 225,image.getIconWidth(),image.getIconHeight());
//            File im2 = new File(chooser.getSelectedFile().getAbsolutePath());
//            try {
//                im = ImageIO.read(im2);
//            } catch (IOException ex) {
//                Logger.getLogger(InsertImageAction.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            TableDecorator t = new TableDecorator() {
//                @Override
//                public void decorate(Graphics g, SpreadsheetTable table) {
//                   g.drawImage(im,uiController.getActiveCell().getAddress().getColumn(),uiController.getActiveCell().getAddress().getRow() ,table );
//                  
//                }
//            };
//            t.setEnabled(true);
//        }
//    }
}
