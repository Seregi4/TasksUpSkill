package main.model;


import main.type.Color;
import main.type.TypePackaging;

public class Packaging {

    private TypePackaging typePackaging;
    private Color color;
    private double price;

    public Packaging(TypePackaging typePackaging, Color color, double price) {
        this.typePackaging = typePackaging;
        this.color = color;
        this.price = price;
    }

    public TypePackaging getTypePackaging() {
        return typePackaging;
    }

    public void setTypePackaging(TypePackaging typePackaging) {
        this.typePackaging = typePackaging;
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
        return typePackaging + " " + color;
    }
}
