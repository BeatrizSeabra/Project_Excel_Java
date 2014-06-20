package csheets.ext.searchFilesBackground.ui;

import csheets.CleanSheets;
import csheets.ext.Extension;
import csheets.ext.searchFilesBackground.ExtensionSearchFilesBackground;
import csheets.ext.searchFilesByContent.ui.JDialogSearchFilesByContent;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
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

    private DefaultListModel listModel;

    /**
     * Um panel onde os ficheiros que são encontrados irao ser listados.
     */
    private JComponent sideBar = null;

    public UIExtensionSearchFilesBackground(Extension extension, UIController uiController) {
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
        listModel.addElement("Background");
        
        filelist = new JList(listModel);

        if (sideBar == null) {
            sideBar = new JPanel(new GridLayout(1, 1));
            sideBar.setName(ExtensionSearchFilesBackground.NAME);

            // Creates components
            JScrollPane filesPane = new JScrollPane(filelist);
            clear();
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
        clear();
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();
    }

    public void addFileName(String name) {
        listModel.addElement(name);
        filelist = new JList(listModel);
        
        sideBar.removeAll();
        clear();
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
        clear();
        JScrollPane filesPane = new JScrollPane(filelist);
        sideBar.add(filesPane);

        sideBar.repaint();
        sideBar.revalidate();
    }

    
    
    public void clear(){
        JPanel botaop = new JPanel();
        
        JButton botao = new JButton("Clear");
            botao.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    cleanList();}
        });
           
        JButton botao1 = new JButton("New Search");
            botao1.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                   JDialogSearchFilesBackground content=new JDialogSearchFilesBackground(null, true, uiController);
                content.setVisible(true);
                content.setResizable(false);
                content.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE );
                content.pack();
                content.setLocationRelativeTo(null);
         ;}
        });    
            
            botaop.add(botao1);
            botaop.add(botao);
            sideBar.add(botaop);  
            
            
    }
}
