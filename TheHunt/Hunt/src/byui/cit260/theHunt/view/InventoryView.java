/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import hunt.Hunt;

/**
 *
 * @author Dragon
 */
public class InventoryView extends View {

    public InventoryView() {
        super("\n"
                + "\n-------------------------------"
                + "\n   Inventory                  "
                + "\n-------------------------------"
                + "\nV - View Map"
                + "\nI - Inventory"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        char selection = choice.charAt(0);

        switch (selection) {
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;

        }

        return true;
    }

    private void viewInventory() {
//        this.console.println("** Functin under construcion **");
        StringBuilder line;

        Game game = Hunt.getCurrentGame();
        Inventory[] inventory = game.getInventory();

        this.console.println("\n           LIST OF INVENTORY");
        line = new StringBuilder("                                  ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "IN STOCK");
        this.console.println(line.toString());

        for (Inventory item : inventory) {
            line = new StringBuilder("                                ");
            line.insert(0, item.getDescription());
            line.insert(20, item.getQuantityInStock());

            this.console.println(line.toString());
        }

    }

    private void displayMap() {
        this.console.println("** View Map from Game Menu **");
//        String leftIndicator;
//        String rightIndicator;
//
//        Game game = Hunt.getCurrentGame(); // retreive the game
//        Map map = game.getMap(); // retreive the map from game
//        Location[][] locations = map.getLocations(); // retreive the locations from map
//        // Build the heading of the map
//        this.console.print("  |");
//        for (int column = 0; column < locations[0].length; column++) {
//            // print col numbers to side of map
//            this.console.print("  " + column + " |");
//        }
    }
}
