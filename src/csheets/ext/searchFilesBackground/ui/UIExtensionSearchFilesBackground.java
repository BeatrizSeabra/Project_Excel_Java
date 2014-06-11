package csheets.ext.searchFilesBackground.ui;

import csheets.CleanSheets;
import csheets.ext.Extension;
import csheets.ext.searchFilesBackground.ExtensionSearchFilesBackground;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import csheets.ui.ctrl.UIController;
import csheets.ui.ext.UIExtension;
import javax.swing.JList;

/**
 *
 * @author i120388
 */
public class UIExtensionSearchFilesBackground extends UIExtension {

    /**
     * The icon to display with the extension's name
     */
    private Icon icon;
    private JList filelist;

    /**
     * Um panel onde os ficheiros que são encontrados irao ser listados.
     */
    private JComponent sideBar = null;

    public UIExtensionSearchFilesBackground(Extension extension, UIController uiController) {
        super(extension, uiController);
        // TODO Auto-generated constructor stub
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
        String[] inicio = {"Background", ""};
        filelist = new JList(inicio);
        if (sideBar == null) {
            sideBar = new JPanel(new GridLayout(1, 1));
            sideBar.setName(ExtensionSearchFilesBackground.NAME);

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

    public void actualizarSidebarConteudo(String[] conteudo) {
        filelist.removeAll();

        if (conteudo != null) {
            filelist = new JList(conteudo);
        } else {
            String[] vazia = new String[1];
            vazia[0] = "No files found";
            filelist = new JList(vazia);
        }
        sideBar.removeAll();
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();

    }
}
