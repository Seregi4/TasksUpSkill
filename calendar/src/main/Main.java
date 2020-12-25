package main;
//Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar(2020, DayOfWeek.WEDNESDAY);
        calendar.printDaysOff();

    }
}
