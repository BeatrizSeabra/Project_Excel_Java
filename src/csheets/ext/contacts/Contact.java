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
 * @author PedroRosário & 1090675 - Tiago Pereira
 */

@Entity
@Table(name = "ContactsTest")
public class Contact implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id;
    private static int id2;
    private String firstName;
    private String lastName;
    private String occupation;
    private int id_residenceFK;
    private int id_residenceFK2;

    public Contact(String firstName, String lastName, int id_residenceFK, int id_residenceFK2) {
        id2++;
        this.id=id2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id_residenceFK = id_residenceFK;
        this.id_residenceFK2 = id_residenceFK2;
    }
    
    public Contact(String firstName, String lastName)
    {
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
     * @return the id_residenceFK
     */
    public int getId_residenceFK() {
        return id_residenceFK;
    }

    /**
     * @param id_residenceFK the id_residenceFK to set
     */
    public void setId_residenceFK(int id_residenceFK) {
        this.id_residenceFK = id_residenceFK;
    }

    /**
     * @return the id_residenceFK2
     */
    public int getId_residenceFK2() {
        return id_residenceFK2;
    }

    /**
     * @param id_residenceFK2 the id_residenceFK2 to set
     */
    public void setId_residenceFK2(int id_residenceFK2) {
        this.id_residenceFK2 = id_residenceFK2;
    }
            
}