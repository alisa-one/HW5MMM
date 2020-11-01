package com.company;

public class Boss {

    private int healtheBoss;
    private int damageBoss;
    private String defenceTypeBoss;

    public String getDefenceTypeBoss() {
        return defenceTypeBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public int getHealtheBoss() {
        return healtheBoss;
    }

    public void setDefenceTypeBoss(String defenceTypeBoss) {
        this.defenceTypeBoss = defenceTypeBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }

    public void setHealtheBoss(int healtheBoss) {
        this.healtheBoss = healtheBoss;
    }

}
