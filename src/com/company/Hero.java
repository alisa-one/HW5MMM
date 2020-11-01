package com.company;

public class Hero {


    private int healthe;
    private int damage;
    private String superAbility;
    private String name;

    public Hero(String name, int healthe, int damage, String superAbility) {
        this.name = name;
        this.healthe = healthe;
        this.damage = damage;
        this.superAbility = superAbility;

    }

    public Hero(String name, int healthe, int damage) {
        this.name = name;
        this.healthe = healthe;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthe() {
        return healthe;
    }

    public void setHealthe(int healthe) {
        this.healthe = healthe;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    @Override
    public String toString() {
        return "Hero{" + name + " has:  " +
                "healthe=" + healthe +
                ", damage=" + damage +
                ", superAbility='" + superAbility + '\'' +
                '}';
    }
}


