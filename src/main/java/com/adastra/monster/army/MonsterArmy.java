package com.adastra.monster.army;

import com.adastra.monster.type.Monster;

public class MonsterArmy {

    private Monster[] monsterArray;

    public MonsterArmy(Monster[] monsterArray){
        this.monsterArray = monsterArray;
    }

    public void allMonstersBattleSound() {

        System.out.println("All monsters battleSound!");

        for (Monster monster : monsterArray) {
            monster.battleSound();
        }
        System.out.println();

    }

    public void evenMonstersAttack() {

        System.out.println("Even monsters attack!");

        for (int i = 0; i < monsterArray.length; i++) {
            if (i % 2 == 0) {
                monsterArray[i].attack();
            }
        }

    }
}
