package main.service;



import main.database.FlowerShop;
import main.model.FlowerComposition;

import java.util.Scanner;

public class CompositionService {

    FlowerShop flowerShop = new FlowerShop();
    FlowerComposition flowerComposition;

    public void run() {
        String choice = "";
        boolean check = false;
        while (true) {
            System.out.println("Create composition enter 1");
            System.out.println("Get composition enter 2");
            System.out.println("Exit enter 3");

            choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1":
                    flowerComposition = new FlowerCompositionCreator(flowerShop).createComposition();
                    break;
                case "2":
                    if (flowerComposition == null) {
                        System.out.println(" Composition not created");
                    } else {
                        flowerComposition.printComposition();
                    }
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
    }
}
