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
public class Rifle implements Serializable {
    
    private String description;
    private String typeOfAmmo;
    private double ammoCapacity;
    
    public Rifle() {
        this.description = "\nThis weapon is for long distance hunts";
        this.typeOfAmmo = "30-06 caliber";
        this.ammoCapacity = 10;
    }
}