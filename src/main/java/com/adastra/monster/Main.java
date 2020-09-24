package com.adastra.monster;

import com.adastra.monster.factory.MonsterFactory;
import com.adastra.monster.factory.MonsterFactoryImpl;
import com.adastra.monster.army.MonsterArmy;

public class Main {

    public static void main(String[] args) {

        MonsterFactory monsterFactory = new MonsterFactoryImpl();

        MonsterArmy monsterGroup = monsterFactory.createRandomMonsterArmy(10);

        monsterGroup.allMonstersBattleSound();

        monsterGroup.evenMonstersAttack();
    }
}
