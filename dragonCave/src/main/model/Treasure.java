package main.model;




import main.TypeTreasure;

import java.text.DecimalFormat;

public class Treasure {

    private TypeTreasure typeTreasure;
    private double price;

    public Treasure(TypeTreasure typeTreasure, double price) {
        this.typeTreasure = typeTreasure;
        this.price = price;
    }

    public TypeTreasure getTypeTreasure() {
        return typeTreasure;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.###");

        return typeTreasure + "        price = " +df.format(price);
    }
}
