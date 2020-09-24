package com.adastra.monster.factory;

import com.adastra.monster.type.Monster;
import com.adastra.monster.army.MonsterArmy;
import com.adastra.monster.type.nightmonsters.Vampire;
import com.adastra.monster.type.nightmonsters.Werewolf;
import com.adastra.monster.type.queuemonsters.Dragon;
import com.adastra.monster.type.queuemonsters.Hydra;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class MonsterFactoryImpl implements MonsterFactory {

    private Random random = new Random();

    private Map<Integer, Supplier<Monster>> monsterProducers = new HashMap<>();

    public MonsterFactoryImpl(){
        this.monsterProducers.put(0, () -> new Vampire());
        this.monsterProducers.put(1, () -> new Hydra());
        this.monsterProducers.put(2, () -> new Werewolf());
        this.monsterProducers.put(3, () -> new Dragon());
    }

    public MonsterArmy createRandomMonsterArmy(int size) {
        Monster[] monsterArray = new Monster[size];

        for (int i = 0; i < size; i++) {
            int producerNumber = random.nextInt(monsterProducers.size());
            Supplier<Monster> monsterProducer = monsterProducers.get(producerNumber);
            monsterArray[i] = monsterProducer.get();
        }
        return new MonsterArmy(monsterArray);
    }
}
