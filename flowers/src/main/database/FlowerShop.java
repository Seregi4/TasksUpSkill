package main.database;



import main.model.Flower;
import main.model.Packaging;

import main.type.Color;
import main.type.NameFlower;
import main.type.TypePackaging;


import java.util.ArrayList;

public class FlowerShop {

    ArrayList<Flower> flowerArrayList = new ArrayList<>();
    ArrayList<Packaging> packagingArrayList = new ArrayList<>();

    public FlowerShop() {
        flowerArrayList.add(new Flower(NameFlower.ROSE, Color.RED, 5));
        flowerArrayList.add(new Flower(NameFlower.ROSE, Color.GREEN, 5));
        flowerArrayList.add(new Flower(NameFlower.ROSE, Color.BLUE, 5));
        flowerArrayList.add(new Flower(NameFlower.ROSE, Color.YELLOW, 5));
        flowerArrayList.add(new Flower(NameFlower.ROSE, Color.WHITE, 5));

        flowerArrayList.add(new Flower(NameFlower.TULIP, Color.RED, 4));
        flowerArrayList.add(new Flower(NameFlower.TULIP, Color.GREEN, 4));
        flowerArrayList.add(new Flower(NameFlower.TULIP, Color.BLUE, 4));
        flowerArrayList.add(new Flower(NameFlower.TULIP, Color.YELLOW, 4));
        flowerArrayList.add(new Flower(NameFlower.TULIP, Color.WHITE, 4));

        flowerArrayList.add(new Flower(NameFlower.CHAMOMILE, Color.RED, 2));
        flowerArrayList.add(new Flower(NameFlower.CHAMOMILE, Color.GREEN, 2));
        flowerArrayList.add(new Flower(NameFlower.CHAMOMILE, Color.BLUE, 2));
        flowerArrayList.add(new Flower(NameFlower.CHAMOMILE, Color.YELLOW, 2));
        flowerArrayList.add(new Flower(NameFlower.CHAMOMILE, Color.WHITE, 2));

        flowerArrayList.add(new Flower(NameFlower.VIOLET, Color.RED, 3));
        flowerArrayList.add(new Flower(NameFlower.VIOLET, Color.GREEN, 3));
        flowerArrayList.add(new Flower(NameFlower.VIOLET, Color.BLUE, 3));
        flowerArrayList.add(new Flower(NameFlower.VIOLET, Color.YELLOW, 3));
        flowerArrayList.add(new Flower(NameFlower.VIOLET, Color.WHITE, 3));

        packagingArrayList.add(new Packaging(TypePackaging.PAPER, Color.WHITE, 2));
        packagingArrayList.add(new Packaging(TypePackaging.PAPER, Color.RED, 2));
        packagingArrayList.add(new Packaging(TypePackaging.PAPER, Color.GREEN, 2));

        packagingArrayList.add(new Packaging(TypePackaging.FOIL, Color.BLUE, 2));
        packagingArrayList.add(new Packaging(TypePackaging.FOIL, Color.WHITE, 2));
        packagingArrayList.add(new Packaging(TypePackaging.FOIL, Color.RED, 2));
    }

    public ArrayList<Flower> getFlowerArrayList() {
        return flowerArrayList;
    }

    public ArrayList<Packaging> getPackagingArrayList() {
        return packagingArrayList;
    }
}
