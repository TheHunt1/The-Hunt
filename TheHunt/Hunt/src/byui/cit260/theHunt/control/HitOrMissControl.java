/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import exceptions.HitControlException;
import java.util.Random;

/**
 *
 * @author Dragon
 */
public class HitOrMissControl {
    
    Random rand = new Random();
    
    int maxChance = 100;
    int maxWeather = 50;
    int maxJacket = 25;

    public int calcHitOrMiss(int chance, int weather, int jacket) throws HitControlException {
        
        chance = rand.nextInt(maxChance);
        weather = rand.nextInt(maxWeather);
        jacket = rand.nextInt(maxJacket);
        
        if (chance < 0 & chance > 100) {
            throw new HitControlException("Chance must be between 0 and 100");
        }
        if (weather > 0) {
            throw new HitControlException("Weather must be between 0 and 50");
        }
        if (jacket < 0 & jacket > 25) {
            throw new HitControlException("Jacket must between 0 and 25");
        }

        int hitOrMiss = chance - weather + jacket;

        if (hitOrMiss > 0 & hitOrMiss < 70) {
            return 0;
        }
        if (hitOrMiss > 71) {
            return 1;
        }
        if (hitOrMiss < 0) {
            throw new HitControlException("hitOrMiss has to be above 0");
        }
        return hitOrMiss;
    }

}
