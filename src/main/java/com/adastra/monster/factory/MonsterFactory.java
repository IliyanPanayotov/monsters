package com.adastra.monster.factory;

import com.adastra.monster.army.MonsterArmy;

public interface MonsterFactory {

    MonsterArmy createRandomMonsterArmy(int size);
}
