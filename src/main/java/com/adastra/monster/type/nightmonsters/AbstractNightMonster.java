package com.adastra.monster.type.nightmonsters;

import com.adastra.monster.type.AbstractMonsterImpl;

public abstract class AbstractNightMonster extends AbstractMonsterImpl {

    @Override
    public void attack() {
        transform();
        super.attack();
    }

    @Override
    public void battleSound() {
        transform();
        super.battleSound();
    }

    private void transform(){
        System.out.println("transform " + this.getClass().getSimpleName());
    }
}
