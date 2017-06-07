/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author MW
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView () {
        this.menu= "\n"
                + "\n-------------------------------"
                + "\n   Help Menu                  "
                + "\n-------------------------------"
                + "\nO - Game objective"
                + "\nM - How to move to different locations"
                + "\nA - Understanding ammo surplus"
                + "\nW - Understanding weapons"
                + "\nT - Understanding Terrains (including weather)"
                + "\nB - Back"
                + "\n-------------------------------";
    }

    public void displayHelpMenuView() {
        
        boolean done = false; //set flag to not done
        do {
           //prompt for and get player's name
           String menuHelpOption = this.getMenuHelpOption();
           if(menuHelpOption.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(menuHelpOption);
        }
        while (!done);;
    }

    private String getMenuHelpOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("\nInvalid value; value can't be blank");
                continue;
                
            }
            break;
        }
        return value;
    }

    private boolean doAction(String menuHelpOption) {
        
        menuHelpOption = menuHelpOption.toUpperCase();
        
        switch (menuHelpOption) {
            case "O":
                this.displayGameObjective();
                break;
            case "M":
                this.displayHowToMove();
                break;
            case "A":
                this.displayAmmoSurplus();
                break;
            case "W":
                this.displayWeapons();
                break;
            case "T":
                this.displayTerrain();
                break;
            case "B":
                new MainMenuView().displayMainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayGameObjective() {
        System.out.println("\n*** displayGameObjective function called ***");
    }

    private void displayHowToMove() {
        System.out.println("\n*** displayHowToMove function called ***");
    }

    private void displayAmmoSurplus() {
        System.out.println("\n*** displayAmmoSurplus function called ***");
    }

    private void displayWeapons() {
        System.out.println("\n*** displayWeapons function called ***");
    }

    private void displayTerrain() {
        System.out.println("\n*** displayTerrain function called ***");
    }
    
}
