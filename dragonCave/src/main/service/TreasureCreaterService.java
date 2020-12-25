package main.service;


import main.TypeTreasure;
import main.model.Cave;
import main.model.Treasure;

import java.util.ArrayList;

public class TreasureCreaterService {

    private Treasure createTreasure() {

        TypeTreasure type = TypeTreasure.values()[(int) (Math.random() * TypeTreasure.values().length)];
        double sum = Math.random() * 500;
        return new Treasure(type, sum);
    }

    public Cave fillCave() {
        Cave cave = new Cave(new ArrayList<>());
        for (int i = 0; i < 100; i++) {
            cave.getTreasures().add(createTreasure());
        }
        return cave;
    }
}
