/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Inventory.InventoryItem;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import hunt.Hunt;
import java.util.Scanner;

/**
 *
 * @author MW
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name== null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Hunt.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        Hunt.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Rifle rifle = new Rifle();
        game.setRifle(rifle);
        
        Bow bow = new Bow();
        game.setBow(bow);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }
     
    public static void quitGame(){
        System.out.println("We hope to see you soon!");
        System.exit(0);
    }
    
    public enum Item {
        food,
        gear,
        weapon,
        ammo;
    }

    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[4];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[InventoryItem.food.ordinal()] = food;
        
        InventoryItem gear = new InventoryItem();
        gear.setDescription("Gear");
        gear.setQuantityInStock(0);
        gear.setRequiredAmount(0);
        inventory[InventoryItem.gear.ordinal()] = gear;
        
        InventoryItem weapon = new InventoryItem();
        weapon.setDescription("Weapon");
        weapon.setQuantityInStock(0);
        weapon.setRequiredAmount(0);
        inventory[InventoryItem.weapon.ordinal()] = weapon;
        
        InventoryItem ammo = new InventoryItem();
        ammo.setDescription("Ammo");
        ammo.setQuantityInStock(0);
        ammo.setRequiredAmount(0);
        inventory[InventoryItem.ammo.ordinal()] = ammo;
        
        return inventory;
    }
}
