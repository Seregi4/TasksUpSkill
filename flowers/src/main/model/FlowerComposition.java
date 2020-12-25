package main.model;

import java.util.ArrayList;

public class FlowerComposition {

    private String name;
    private ArrayList<Flower> flowers;
    private ArrayList<Packaging> packagings;

    public FlowerComposition() {
    }

    public FlowerComposition(String name) {
        this.name = name;
        flowers = new ArrayList<>();
        packagings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFlower(Flower flower) {

        flowers.add(flower);
    }

    public void addPacking(Packaging packaging) {

        packagings.add(packaging);
    }

    public double getPrice() {

        double sum = 0;

        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }

        for (Packaging packaging : packagings) {
            sum += packaging.getPrice();
        }

        return sum;
    }

    public void printComposition() {

        System.out.println("FlowerComposition    " + name + flowers + " " + packagings + "\n" + " sum = " + getPrice());
    }

}
