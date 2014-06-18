/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.searchFilesByContent.ui;

import csheets.CleanSheets;
import csheets.ext.Extension;
import csheets.ext.searchFilesByContent.ExtensionSearchFilesByContent;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Pedro
 */
public class UIExtensionSearchFilesByContent extends UIExtension {

    /**
     * The icon to display with the extension's name
     */
    private Icon icon;
    private JList filelist;

    private DefaultListModel listModel;

    /**
     * Um panel onde os ficheiros que são encontrados irao ser listados.
     */
    private JComponent sideBar = null;

    public UIExtensionSearchFilesByContent(Extension extension, UIController uiController) {
        super(extension, uiController);
    }

    /**
     * Returns an icon to display with the extension's name.
     *
     * @return an icon with style
     */
    public Icon getIcon() {
        if (icon == null) {
            icon = new ImageIcon(CleanSheets.class.getResource("res/img/find.gif"));
        }
        return icon;
    }

    /**
     * Returns a side bar that gives access to extension-specific functionality.
     *
     * @return a component, or null if the extension does not provide one
     */
    @Override
    public JComponent getSideBar() {
        listModel=new DefaultListModel();
        listModel.addElement("By Content");
        
        filelist = new JList(listModel);

        if (sideBar == null) {
            sideBar = new JPanel(new GridLayout(1, 1));
            sideBar.setName(ExtensionSearchFilesByContent.NAME);

            // Creates components
            JScrollPane filesPane = new JScrollPane(filelist);

            // Adds borders
            TitledBorder border = BorderFactory.createTitledBorder("Files");
            border.setTitleJustification(TitledBorder.CENTER);
            filesPane.setBorder(border);

            // Creates side bar
            sideBar.add(filesPane);
        }
        return sideBar;
    }
    
    public void cleanList(){
        listModel.removeAllElements();
        filelist = new JList(listModel);
        
        sideBar.removeAll();
        
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();
    }

    public void addFileName(String name) {
        listModel.addElement(name);
        filelist = new JList(listModel);
        
        sideBar.removeAll();
        
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();

    }

    public void noFileFound() {
        filelist.removeAll();

        String[] vazia = new String[1];
        vazia[0] = "No files found";
        filelist = new JList(vazia);

        sideBar.removeAll();
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();
    }

}
