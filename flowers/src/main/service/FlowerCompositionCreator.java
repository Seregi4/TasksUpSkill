package main.service;



import main.database.FlowerShop;
import main.model.Flower;
import main.model.FlowerComposition;
import main.model.Packaging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowerCompositionCreator {
    private FlowerShop flowerShop;

    public FlowerCompositionCreator(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
    }

    public FlowerComposition createComposition() {
        System.out.println("Enter name composition");
        String name = new Scanner(System.in).nextLine();
        FlowerComposition flowerComposition = new FlowerComposition(name);
        String choice = "";
        boolean check = false;
        while (true) {

            System.out.println("press  1 for add flower");
            System.out.println("press 2 for add packaging");
            System.out.println("press 3 for exit");
            choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1":
                    printAllFlowers();
                    addFlower(flowerComposition);
                    break;
                case "2":
                    printAllPackaging();
                    addPackaging(flowerComposition);
                    break;
                case "3":
                    check = true;
                    break;
                default:
                    System.out.println("Incorrect value");

            }
            if (check) {
                break;
            }
        }
        return flowerComposition;
    }


    private void printAllFlowers() {
        int count = -1;
        for (Flower flower : flowerShop.getFlowerArrayList()) {
            count++;
            System.out.println(flower + " is number " + count);
        }
    }

    private void addFlower(FlowerComposition flowerComposition) {
        System.out.println("Enter number flower");
        int choice = 0;
        boolean check = false;
        int flowerlim = flowerShop.getFlowerArrayList().size();
        while (true) {
            try {
                choice = new Scanner(System.in).nextInt();

            } catch (InputMismatchException e) {

                System.out.println("incorrectr");
                choice = -1;
            }

            if (choice >= 0 && choice <= flowerlim - 1) {
                flowerComposition.addFlower(flowerShop.getFlowerArrayList().get(choice));
                System.out.println(flowerShop.getFlowerArrayList().get(choice) + " added");
                break;
            } else {
                System.out.println("Enter number flower");
            }

        }
    }

    private void printAllPackaging() {
        int count = -1;
        for (Packaging packaging : flowerShop.getPackagingArrayList()) {
            count++;
            System.out.println(packaging + " is number " + count);
        }
    }

    private void addPackaging(FlowerComposition flowerComposition) {
        System.out.println("Enter number Packaging");
        int choice = 0;
        boolean check = false;
        int packaginglim = flowerShop.getPackagingArrayList().size();
        while (true) {
            try {
                choice = new Scanner(System.in).nextInt();

            } catch (InputMismatchException e) {

                System.out.println("incorrect");
                choice = -1;
            }

            if (choice >= 0 && choice <= packaginglim - 1) {
                flowerComposition.addPacking(flowerShop.getPackagingArrayList().get(choice));
                System.out.println(flowerShop.getPackagingArrayList().get(choice) + " added");
                break;
            } else {
                System.out.println("Enter number packaging");
            }

        }
    }
}
