/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csheets.ext.contacts;

import javax.persistence.*;

/**
 *
 * @author Nuno
 */

@Entity
public class Residence implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_residence;
    private String street;
    private String locality;
    private int postal_code;
    private String city;
    private String country;
    
    public Residence() {
        
    }
    
    public Residence(int id_residence, String street, String locality, int postal_code, String city, String country) {
        this.id_residence = id_residence;
        this.street = street;
        this.locality = locality;
        this.postal_code = postal_code;
        this.city = city;
        this.country = country;
    }

    /**
     * @return the id_residence
     */
    public int getId_residence() {
        return id_residence;
    }

    /**
     * @param id_residence the id_residence to set
     */
    public void setId_residence(int id_residence) {
        this.id_residence = id_residence;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * @param locality the locality to set
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * @return the postal_code
     */
    public int getPostal_code() {
        return postal_code;
    }

    /**
     * @param postal_code the postal_code to set
     */
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String toString(Residence res)
    {
        String residence = res.getStreet() + " " + res.getLocality()
                    + " " + res.getPostal_code() + " " + res.getCity() +
                    " " + res.getCountry();
        
        return residence;
    }
}
