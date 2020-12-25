package main;

//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
// и выбора сокровищ на заданную сумму.


import main.service.MenuService;

public class Main {

    public static void main(String[] args) {

        MenuService menuService = new MenuService();
        menuService.run();
    }
}
