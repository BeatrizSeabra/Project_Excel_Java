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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nuno
 */
public class InsertResidenceUI extends JFrame {
    
    JTextField street;
    JTextField locality;
    JTextField postal;
    JTextField code;
    JTextField city;
    JTextField country;
    
    JButton save;
    JButton cancel;
    
    public InsertResidenceUI()
    {
        super("Insert Residences");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel(new GridLayout(5,2,2,0));
        JPanel postal_code = new JPanel(new FlowLayout());
        
        street = new JTextField("", 12);
        locality = new JTextField("", 12);
        postal = new JTextField("", 4); code = new JTextField("", 3);
        city = new JTextField("", 12);
        country = new JTextField("", 12);
        
        postal_code.add(postal); postal_code.add(new JLabel(" - ")); postal_code.add(code);
        
        p1.add(new JLabel("Street")); p1.add(street);
        p1.add(new JLabel("Locality")); p1.add(locality);
        p1.add(new JLabel("Postal Code")); p1.add(postal_code);
        p1.add(new JLabel("City")); p1.add(city);
        p1.add(new JLabel("Country")); p1.add(country);
        
        JPanel p2 = new JPanel(new FlowLayout());
        save = new JButton("Save");
        save.addActionListener(new BotaoListener());
        
        cancel = new JButton("Cancel");
        cancel.addActionListener(new BotaoListener());
        
        p2.add(save);
        p2.add(cancel);
        
        c.add(p1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.SOUTH);
        c.add(new JPanel(), BorderLayout.NORTH);
        c.add(new JPanel(), BorderLayout.WEST);
        c.add(new JPanel(), BorderLayout.EAST);
        
        pack();
        setResizable(false);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    class BotaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(save == e.getSource()) {

                String stree = street.getText();
                String local = locality.getText();
                int post = Integer.parseInt(postal.getText());
                int cod = Integer.parseInt(code.getText());
                
                int post_cod = post * 1000 + cod;
                
                String cit = city.getText();
                String count = country.getText();
                
                Residence residence = new Residence(0, stree, local, post_cod, cit, count);
                
                ResidenceRepository resRep = new ResidenceRepository();
                resRep.insert(residence);
                
                JOptionPane.showMessageDialog(rootPane, "A new residence incert");
            }
            else if(cancel == e.getSource())
            {
                 InsertResidenceUI.this.dispose();
            }
        }
    }   
}
