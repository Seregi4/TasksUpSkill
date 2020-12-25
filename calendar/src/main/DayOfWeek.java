package main;

public enum DayOfWeek {
    MONDAY(" MONDAY",false,1),
    TUESDAY(" TUESDAY",false,2),
    WEDNESDAY(" WEDNESDAY",false,3),
    THURSDAY(" Четверг",false,4),
    FRIDAY(" FRIDAY",false,5),
    SATURDAY(" Cуббота",true,6),
    SUNDAY(" SUNDAY",true,7);

    private String name;
    private boolean dayOff;
    private int numberOfDay;

    DayOfWeek(String name, boolean dayOff, int numberOfDay) {
        this.name = name;
        this.dayOff = dayOff;
        this.numberOfDay = numberOfDay;
    }

    public String getName() {
        return name();
    }

    public boolean isDayOff() {
        return dayOff;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}
