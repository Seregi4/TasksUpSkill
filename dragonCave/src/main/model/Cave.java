package main.model;

import java.util.ArrayList;

public class Cave {

private ArrayList<Treasure>treasures;

    public Cave(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
