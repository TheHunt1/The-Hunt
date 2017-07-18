/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Dragon
 */
public class PlayerStatus implements Serializable{
//  private String name; 
  private int energy;
  private int money;
  private int currentScore;

    public PlayerStatus() {
    }

  
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.energy;
        hash = 13 * hash + this.money;
        hash = 13 * hash + this.currentScore;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerStatus other = (PlayerStatus) obj;
        if (this.energy != other.energy) {
            return false;
        }
        if (this.money != other.money) {
            return false;
        }
        if (this.currentScore != other.currentScore) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayerStatus{" + "energy=" + energy + ", money=" + money + ", currentScore=" + currentScore + '}';
    }
    
}
