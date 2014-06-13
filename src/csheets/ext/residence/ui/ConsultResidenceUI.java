/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.residence.ui;

import csheets.PersistenceJPA.ResidenceRepository;
import csheets.ext.contacts.Residence;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nuno
 */
public final class ConsultResidenceUI extends JFrame {
    
    JLabel id_residence;
    JLabel street;
    JLabel locality;
    JLabel postal; JLabel code;
    JLabel city;
    JLabel country;
    
    JButton next;
    JButton preview;
    JButton edit;
    JButton delete;
    JButton home;
    JButton end;
    
    private List<Residence> listResidence;
    
    int index = 0;
    
    private static ConsultResidenceUI instance;
    
    public static synchronized ConsultResidenceUI getInstance() {
        if (instance == null) {
            instance = new ConsultResidenceUI();
        }
        return instance;
    }
    
    public ConsultResidenceUI()
    {
        super("Consult Residence");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel(new GridLayout(6,2,2,0));
        JPanel postal_code = new JPanel(new FlowLayout());
        
        id_residence = new JLabel();
        street = new JLabel();
        locality = new JLabel();
        postal = new JLabel(); code = new JLabel();
        city = new JLabel();
        country = new JLabel();
        
        postal_code.add(postal); postal_code.add(new JLabel(" - ")); postal_code.add(code);
        
        p1.add(new JLabel("id street")); p1.add(id_residence);
        p1.add(new JLabel("Street")); p1.add(street);
        p1.add(new JLabel("Locality")); p1.add(locality);
        p1.add(new JLabel("Postal Code")); p1.add(postal_code);
        p1.add(new JLabel("City")); p1.add(city);
        p1.add(new JLabel("Country")); p1.add(country);
        
        JPanel p2 = new JPanel(new FlowLayout());
        preview = new JButton("Preview");
        preview.addActionListener(new BotaoListener());

        next = new JButton("Next");
        next.addActionListener(new BotaoListener());
        
        home = new JButton("Home");
        home.addActionListener(new BotaoListener());
        
        end = new JButton("End");
        end.addActionListener(new BotaoListener());
        
        edit = new JButton("Edit");
        edit.addActionListener(new BotaoListener());
        
        delete = new JButton("Delete");
        delete.addActionListener(new BotaoListener());
        
        p2.add(home);
        p2.add(preview);
        p2.add(next);
        p2.add(end);
        
        JPanel pSouth = new JPanel(new GridLayout(2,1,2,2));
        JPanel p3 = new JPanel();
        p3.add(edit);
        p3.add(delete);
        
        pSouth.add(p2);
        pSouth.add(p3);
        
        c.add(p1, BorderLayout.CENTER);
        c.add(pSouth, BorderLayout.SOUTH);
        c.add(new JPanel(), BorderLayout.NORTH);
        c.add(new JPanel(), BorderLayout.WEST);
        c.add(new JPanel(), BorderLayout.EAST);
        
        pack();
        setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
        
        insertListResidences();
        fill();
        
    }

    /**
     * @return the listResidence
     */
    public List<Residence> getListResidence() {
        return listResidence;
    }

    /**
     * @param listResidence the listResidence to set
     */
    public void setListResidence(List<Residence> listResidence) {
        this.listResidence = listResidence;
    }

    class BotaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(next == e.getSource()) {
                next();
            }
            else if(preview == e.getSource())
            {
                preview();
            }
            else if(home == e.getSource())
            {
                home();
            }
            else if(end == e.getSource())
            {
                end();
            }
            else if(edit == e.getSource())
            {
                Residence residence = new Residence(getListResidence().get(index));
                EditResidenceUI editResidenceUI = new EditResidenceUI(residence);
            }
            else if(delete == e.getSource())
            {
                delete();
            }
        }
    }
    
    public void insertListResidences() {
        //ResidenceRepository res = new ResidenceRepository();
//        setListResidence(new ArrayList<>());
        setListResidence(ResidenceRepository.getAll());
    }
    
    public void fill()
    {
        id_residence.setText(Integer.toString(getListResidence().get(index).getId_residence()));
        street.setText(getListResidence().get(index).getStreet());
        locality.setText(getListResidence().get(index).getLocality());
        city.setText(getListResidence().get(index).getCity());
        country.setText(getListResidence().get(index).getCountry());
        
        String postal_code = Integer.toString(getListResidence().get(index).getPostal_code());
        
        String scode = postal_code.substring(4);
        
        String spostal = postal_code.substring(0,4);
        
        postal.setText(spostal);
        code.setText(scode);
 
    }
    
    public void next() {
        
        index++;
        
        if(index >= getListResidence().size())
        {
            index--;
        }
        
        fill();
    }
    
    public void preview() {
        index--;
        
        if(index < 0)
        {
            index++;
        }
        
        fill();
    }
    
    public void home() {
        index = 0;
        
        fill();
    }
    
    public void end() {
        index = getListResidence().size() - 1;
        
        fill();
    }
    
    public void setResidence(int i, Residence residence) {
        getListResidence().set(i, residence);
    }
    
    public int getIndex() {
        return index;
    }
    
    public void delete() {
            JFrame fDelete = new JFrame();

            int option = JOptionPane.showConfirmDialog(fDelete, "Delete Residence?", "Residences",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) ; 

            if(option == JOptionPane.YES_OPTION)
            {
                Residence residence = new Residence(getListResidence().get(index));
                ResidenceRepository resRepo = new ResidenceRepository();
                resRepo.delete(residence);

                insertListResidences();
                fill();
            }
    }
}