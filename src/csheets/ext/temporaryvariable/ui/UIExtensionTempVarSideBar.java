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
import csheets.ext.temporaryvariable.TemporaryVariablesListener;
import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Diogo Moreira (1120339)
 */
public class UIExtensionTempVarSideBar extends UIExtension implements TemporaryVariablesListener {

    /**
     * The icon to display with the extension's name
     */
    private Icon icon;
    private JList variableListBar;

    private DefaultListModel listModel;

    /**
     * Um panel onde os ficheiros que são encontrados irao ser listados.
     */
    private JComponent sideBar = null;

    public UIExtensionTempVarSideBar(Extension extension, UIController uiController) {
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
        listModel = new DefaultListModel();

        variableListBar = new JList(listModel);
        if (sideBar == null) {
            sideBar = new JPanel(new GridLayout(1, 1));
            sideBar.setName("Variable Side Bar");

            // Creates components
            JScrollPane variablePane = new JScrollPane(variableListBar);

            // Adds borders
            TitledBorder border = BorderFactory.createTitledBorder("Variables");
            border.setTitleJustification(TitledBorder.CENTER);
            variablePane.setBorder(border);

            // Creates side bar
            sideBar.add(variablePane);

        }
        return sideBar;
    }

    @Override
    public void variableCreatedOrUpdated(final ArrayList<TemporaryVariable> variableList) {
        listModel.clear();
        for (TemporaryVariable temporaryVariable : variableList) {
            listModel.addElement(temporaryVariable.getVarName());
        }
        variableListBar = new JList(listModel);

        sideBar.removeAll();

        JScrollPane filesPane = new JScrollPane(this.variableListBar);
        sideBar.add(filesPane);

        variableListBar.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    JList list = (JList) lse.getSource();
                    TemporaryVariable tempVarAux = null;
                    for (TemporaryVariable tempVar : variableList) {
                        if (tempVar.getVarName().equals(list.getSelectedValue())) {
                            tempVarAux = tempVar;
                        }
                    }
                    if (tempVarAux == null) {
                        return;
                    }
                    JDialogTemporaryVariableEditor temporaryVariableEditor = new JDialogTemporaryVariableEditor(null, true);
                    temporaryVariableEditor.setVariableName(tempVarAux.getVarName());
                    temporaryVariableEditor.setVariableValue(tempVarAux.getValue().toString());
                    temporaryVariableEditor.setTemporaryVariable(tempVarAux);
                    temporaryVariableEditor.setTitle("Temporary Variable Editor");
                    temporaryVariableEditor.setResizable(false);
                    temporaryVariableEditor.setLocationRelativeTo(null);
                    temporaryVariableEditor.setVisible(true);
                    list.clearSelection();
                    variableCreatedOrUpdated(variableList);
                }
            }
        });
        sideBar.repaint();
        sideBar.revalidate();
    }
}
