package main;



import main.model.Cave;
import main.model.Treasure;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CaveLogic {
    private Cave cave;

    public CaveLogic(Cave cave) {
        this.cave = cave;
    }

    public void printAll() {
        printTreasure(cave.getTreasures());
    }

    public void getMax() {
        Treasure treasure = cave.getTreasures().stream()
                .max(Comparator.comparing(Treasure::getPrice))
                .orElse(null);
        System.out.println(treasure);
        System.out.println();
        System.out.println();


    }

    public void printTreasureByPrice() {
        System.out.println("Enter a maximum amount of 500");
        double choice = 0;
        boolean check = true;

        while (true) {
            try {
                choice = new Scanner(System.in).nextDouble();

            } catch (InputMismatchException e) {

                System.out.println("incorrectr");
                check = false;
            }

            if (check && choice <= 500 && choice > 0) {
                double finalChoice = choice;

                List<Treasure> treasures = cave.getTreasures().stream()
                        .filter(treasure -> treasure.getPrice() <= finalChoice)
                        .collect(Collectors.toList());

                printTreasure(treasures);


                if (treasures.size() == 0) {
                    System.out.println("There are no such treasures");
                    System.out.println();
                }

                break;
            } else {
                System.out.println("Enter new sum");
                System.out.println();
            }
        }
    }

    public void printTreasure(List<Treasure> treasureList) {
        DecimalFormat df = new DecimalFormat("###.###");
        for (Treasure treasure : treasureList) {
            System.out.printf("%-10s  %-10s\n", treasure.getTypeTreasure(), df.format(treasure.getPrice()));
        }
        System.out.println();
    }
}
