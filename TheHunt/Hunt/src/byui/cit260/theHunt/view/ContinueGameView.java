/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;

/**
 *
 * @author MW
 */
public class ContinueGameView extends View {
    
    public ContinueGameView() {
        super("\n"
                + "\n-------------------------------"
                + "\n   Continue Game?              "
                + "\n-------------------------------"
                + "\nY - Yes"
                + "\nN - No"
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "Y":
                new GameMenuView().display();
            case "N":
                GameControl.quitGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }       
        
        return false;
    }
}
