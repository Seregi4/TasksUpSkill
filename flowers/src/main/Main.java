package main;

//Реализовать приложение, позволяющее создавать цветочные композиции
// (объект, представляющий собой цветочную композицию).
// Составляющими цветочной композиции являются цветы и упаковка.


import main.service.CompositionService;

public class Main {

    public static void main(String[] args) {

        CompositionService service = new CompositionService();
        service.run();
    }

}
