package main.service;


import main.CaveLogic;
import main.model.Cave;

import java.util.Scanner;

public class MenuService {


    public void run() {
        System.out.println("                                       Dragon cave welcomes you");
        System.out.println();
        System.out.println();
        System.out.println();

        Cave cave = new TreasureCreaterService().fillCave();
        CaveLogic caveLogic = new CaveLogic(cave);
        String choice = "";
        boolean check = false;
        while (true) {
            System.out.println("Print all treasures enter 1");
            System.out.println("Show the most expensive treasure enter 2");
            System.out.println("Show  a treasure for a given amount enter 3");
            System.out.println("Exit enter 4");

            choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1":
                    caveLogic.printAll();
                    break;
                case "2":
                    caveLogic.getMax();
                    break;
                case "3":
                    caveLogic.printTreasureByPrice();
                    break;
                case "4":
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
