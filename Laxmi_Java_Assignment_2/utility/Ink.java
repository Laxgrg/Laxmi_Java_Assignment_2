package utility;
import warrior.*;
import weapon.*;
import armour.*;

/*
 * Class for all of our in games prints
 */
public class Ink {
  
  public Ink() {
    // do nothing
  } // constructor

  public void welcome() {
    System.out.printf("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
        """);
  } // welcome()

  public void printWarriorMenu() {
    System.out.println("###############################################################");
    System.out.println("Pick your Warrior \nOptions are:\n \n1 Human\n2 Elf\n3 Orc\n");
  }

  public void printWeaponMenu() {
    System.out.println("################################################################");
    System.out.println("Pick your Weapon \nOptions are:\n \n 1 Dagger \n 2 Sword \n 3 Axe \n");
  }

  public void printArmourMenu() {
    System.out.println("################################################################### \n");
    System.out.println("Pick your Armour \nOptions are: \n \n1 Leather\n2 Chainmail\n3 Platemail\n");
  }

  public void printAttackMenu() {
    System.out.println("###################################################  \n");
   
    System.out.println("Pick one of the attack types:\n \n1 Normal\n2 Heavy \n");
  }
  public void printStats(Warrior player, Warrior enemy) {
    System.out.println("\n****************************************************");
    System.out.printf("* %-33s%-33s\n",
      "Player: " + player.getWarriorType(), "Enemy: " + enemy.getWarriorType());
    System.out.printf("* Health: %-25dHealth: %-25d\n", player.getHealth(), 
      enemy.getHealth());
    System.out.printf("* Strength: %-23dStrength: %-23d\n", 
      player.getStrength(), enemy.getDexterity());
    System.out.printf("* Dexterity: %-22dDexterity: %-22d\n", 
      player.getDexterity(), enemy.getDexterity());
    System.out.println("****************************************************\n");
  }

   public void printWeaponType(Weapon playerWeapon, Weapon enemyWeapon) {
    System.out.println("\n**********************-WEAPON-************************");
    System.out.printf("* %-33s%-33s\n",
      "Player: " + playerWeapon.getWeaponType(), "Enemy: " + enemyWeapon.getWeaponType());
      System.out.printf("* Damage Amount: %-18dDamage Amount: %-18d\n", playerWeapon.getDamageAmount(), 
      enemyWeapon.getDamageAmount());
      System.out.printf("* Dexterity: %-22dDexterity: %-22d\n", 
      playerWeapon.getDexterityCost(), enemyWeapon.getDexterityCost());
    System.out.println("******************************************************\n");}

  
    public void printArmourType(Armour playerArmour, Armour enemyArmour) {
      System.out.println("\n**********************-ARMOUR-************************");
      System.out.printf("* %-33s%-33s\n",
        "Player: " + playerArmour.getArmourType(), "Enemy: " + enemyArmour.getArmourType());
        System.out.printf("* Armour Amount: %-18dArmour Amount: %-18d\n", playerArmour.getArmourAmount(), 
        enemyArmour.getArmourAmount());
        System.out.printf("* Dexterity: %-22dDexterity: %-22d\n", playerArmour.getArmourAmount(), 
        enemyArmour.getArmourAmount());
      System.out.println("******************************************************\n");
    }

  public void printGameOver(String winner) {
    System.out.printf("""
       ____                         ___                 
      / ___| __ _ _ __ ___   ___   / _ \\__   _____ _ __ 
     | |  _ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|
     | |_| | (_| | | | | | |  __/ | |_| |\\ V /  __/ |   
      \\____|\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| 
      \n %s\n\n  
      """, winner + " wins! Congrats");
        
  } // printGameOver()

} // class
