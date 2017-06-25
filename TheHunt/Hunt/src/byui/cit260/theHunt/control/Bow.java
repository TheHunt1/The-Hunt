/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import java.io.Serializable;

/**
 *
 * @author MW
 */
public class Bow implements Serializable {
    
    private String description;
    private String typeOfAmmo;
    private double ammoCapacity;
    
    public Bow() {
        this.description = "\nThis weapon is a compound bow intended for close range hunting";
        this.typeOfAmmo = "\nThe compound bow uses arrows";
        this.ammoCapacity = 7;
    }
}
