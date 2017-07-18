/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.HitOrMissControl;
import byui.cit260.theHunt.model.PlayerStatus;
import byui.cit260.theHunt.model.Score;
import exceptions.HitControlException;
import java.util.Random;

/**
 *
 * @author Dragon
 */
public class HuntSceneView extends View {

    public HuntSceneView() {

        super("\n"
                + "\n-------------------------------"
                + "\n   Hunt Scene                   "
                + "\n-------------------------------"
                + "\nI - Open Inventory"
                + "\nS - Shoot"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "I":
                this.InventoryView();
                break;
            case "S":
                this.calcHitOrMiss();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void InventoryView() {
        this.console.println("InventoryView called");
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();

    }

    public void calcHitOrMiss() {
        //PlayerStatus playerstatus = new PlayerStatus();
        //int score = playerstatus.getCurrentScore().getScore();
        int score = 0;
        Random rand = new Random();

        int maxChance = 100;
        int maxWeather = 50;
        int maxJacket = 25;

        int hitOrMiss;

        while (score < 10) {
            
            int chance = rand.nextInt(maxChance);
            int weather = rand.nextInt(maxWeather);
            int jacket = rand.nextInt(maxJacket);

            hitOrMiss = chance - weather + jacket;

            if (hitOrMiss < 40) {
                this.console.println("\n\t--- You miss. Select a new location to hunt. ---");
                new GameMenuView().display();
            }
            else if (hitOrMiss >= 40) {
                if (score == 10) {
                    break;
                } else {
                    score++;
                    
                    this.console.println("\n\t*** Hit! ***");
                    this.console.println("\n\tYou have " + score + " kills!");
                    this.console.println("\n\tKeep going! You need 10 kills to win!");
                    new GameMenuView().display();
                }

            }
        }
        this.console.println("################");
        this.console.println("##            ##");
        this.console.println("##  YOU WIN!  ##");
        this.console.println("##            ##");
        this.console.println("################");
        
        ContinueGameView continueGame = new ContinueGameView();
        continueGame.display();

    }

}
