package com.adastra.monster.type;

public abstract class AbstractMonsterImpl implements Monster {

    public void attack() {
        System.out.println("attack " + this.getClass().getSimpleName());
    }

    public void battleSound() {
        System.out.println("battleSound " + this.getClass().getSimpleName());
    }
}
