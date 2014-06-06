/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts;



import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author PedroRosário
 */

@Entity
@Table(name = "Contacts")
public class Contact implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;
    private static int id2;
    private String firstName;
    private String lastName;
    private String occupation;
    private Residence residence;

    public Contact(String firstName, String lastName) {
        id2++;
        this.id=id2;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the residence
     */
    public Residence getResidence() {
        return residence;
    }

    /**
     * @param residence the residence to set
     */
    public void setResidence(Residence residence) {
        this.residence = residence;
    }
    
    
    
    
}