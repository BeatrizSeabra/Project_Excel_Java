/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.temporaryvariable.ui;

import csheets.CleanSheets;
import csheets.core.formula.TemporaryVariable;
import csheets.ext.Extension;
import csheets.ext.searchFilesBackground.ExtensionSearchFilesBackground;
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
 * @author Diogo Moreira (1120339)
 */
public class UIExtensionTemporaryVariables extends UIExtension{

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
    
    public UIExtensionTemporaryVariables(Extension extension, UIController uiController) {
        super(extension, uiController);
    }
    
    /**
     * Returns an icon to display with the extension's name.
     *
     * @return an icon with style
     */
    public Icon getIcon() {
        if (icon == null) {
            icon = new ImageIcon(CleanSheets.class.getResource("res/img/@.png"));
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
        
        filelist = new JList(listModel);

        if (sideBar == null) {
            sideBar = new JPanel(new GridLayout(1, 1));
            sideBar.setName(ExtensionSearchFilesBackground.NAME);

            // Creates components
            JScrollPane filesPane = new JScrollPane(filelist);

            // Adds borders
            TitledBorder border = BorderFactory.createTitledBorder("Variables");
            border.setTitleJustification(TitledBorder.CENTER);
            filesPane.setBorder(border);

            // Creates side bar
            sideBar.add(filesPane);
        }
        return sideBar;
    }
    
    public void addVariable(TemporaryVariable temporaryVariable){
        listModel.addElement(temporaryVariable.getVarName());
        filelist = new JList(listModel);
        
        sideBar.removeAll();
        
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();
    }
}
