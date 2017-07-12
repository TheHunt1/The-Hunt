/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MW
 */
public class WeaponStoreMenuView extends View {

    public WeaponStoreMenuView() {
        super("\n"
                + "\n---------------------------------"
                + "\n      Weapons Store              "
                + "\n---------------------------------"
                + "\nW - Weapons list"
                + "\nP - Purchase weapon"
                + "\nB - Back");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "W":
                this.WeaponList();
                break;
            case "P":
                System.out.println("\n*** Use the money you earned from your kills "
                        + "\nto purchase a weapons. Here you will select and purchase "
                        + "\nweapons. ***");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void WeaponList() {

        this.console.println("Enter where you want to save the file");
        String filePath = this.getInput();

        try {
            WeaponStoreMenuView.buildList(filePath);
        } catch (Exception ex) {
            ErrorView.display(filePath, displayMessage);
        }

    }

    private static void buildList(String filePath) throws IOException {
        String[] aList = new String[]{"Rifle cost $135 \nPistol cost $85 "
            + "\nBow cost $100 "};

        FileReader in = null;
        FileWriter out = null;

        try {
            for (String object : aList) {
                //System.out.println(object);
                out = new FileWriter(filePath);
                out.write(object);
            }
            //in = new FileReader("list.txt");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}
