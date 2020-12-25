package main.model;


import main.type.Color;
import main.type.NameFlower;

public class Flower {

    private NameFlower name;
    private Color color;
    private double price;

    public Flower(NameFlower name, Color color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public NameFlower getName() {
        return name;
    }

    public void setName(NameFlower name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + color;
    }

}
