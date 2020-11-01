package com.company;

public class Main {


    public static void main(String[] args) {

        // write your code here
        Boss Boss1 = new Boss();
        Boss1.setHealtheBoss(1500);
        Boss1.setDamageBoss(200);
        Boss1.setDefenceTypeBoss("BackFight");
        System.out.println("Boss1" + " has: " + " Healthe = " + Boss1.getHealtheBoss() + "  Damage =  "
                + Boss1.getDamageBoss() + "  DefenceType  = " + Boss1.getDefenceTypeBoss());

        for (Hero Figt :
                createHeroes()) {

            System.out.println(Figt.toString());
        }
    }

    public static Hero[] createHeroes() {
        Hero Gold = new Hero("Gold", 1500, 300, "Goldfight");
        Hero Silver = new Hero("Silver", 2500, 200, "SilverFight");
        Hero Fly = new Hero("Fly", 1800, 180);

        Hero Fighters[] = {Gold, Silver, Fly};
        return Fighters;


    }

}

