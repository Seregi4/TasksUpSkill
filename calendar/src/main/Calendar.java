package main;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Calendar {

    private int numberOfYear;
    private ArrayList<Day> days = new ArrayList<>();
    private DayOfWeek firstDayInYear;

    public Calendar(int numberOfYear, DayOfWeek firstDayInYear) {
        this.numberOfYear = numberOfYear;
        this.firstDayInYear = firstDayInYear;
        initYear();
    }

    private void initYear() {

       MonthName[] monthNames = MonthName.values();
        DayOfWeek lastDayInPrevMonth = findLastDayInPrevYear();

        for (MonthName monthName : monthNames) {
            int weekCount = 1;
            int maxDaysCountInMonth = monthName.getDaysCount(numberOfYear);
            int currentDayInMonth = 1;
            int numberLastDayInPrevMonth;
            if (lastDayInPrevMonth == DayOfWeek.SUNDAY) {
                numberLastDayInPrevMonth =0;
            } else {
                numberLastDayInPrevMonth = lastDayInPrevMonth.getNumberOfDay();
            }
            while (currentDayInMonth <= maxDaysCountInMonth) {
                if (weekCount == 1) {
                    for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                        int numberDayInWeek = dayOfWeek.getNumberOfDay();

                        if (numberDayInWeek > numberLastDayInPrevMonth) {
                            if (currentDayInMonth <= maxDaysCountInMonth) {
                                Day day = createDay(monthName, currentDayInMonth, dayOfWeek);
                                days.add(day);
                                currentDayInMonth++;
                            } else {
                                break;
                            }
                        }
                    }
                    weekCount++;
                } else {
                    for (DayOfWeek dayOfWeek : DayOfWeek.values()) {

                        if (currentDayInMonth <= maxDaysCountInMonth) {
                            Day day = createDay(monthName, currentDayInMonth, dayOfWeek);
                            days.add(day);
                            currentDayInMonth++;
                            lastDayInPrevMonth = dayOfWeek;
                        } else {
                            break;
                        }


                    }
                    weekCount++;
                }
            }
        }
    }

    private Day createDay(MonthName monthName, int currentDayInMonth, DayOfWeek dayOfWeek) {
        Day day = new Day();
        day.setYear(numberOfYear);
        day.setDayOfWeek(dayOfWeek);
        day.setMonthName(monthName);
        day.setNumberInMonth(currentDayInMonth);
        return day;
    }

    private DayOfWeek findLastDayInPrevYear() {
        switch (firstDayInYear){
            case MONDAY:return DayOfWeek.SUNDAY;
            case TUESDAY:return DayOfWeek.MONDAY;
            case WEDNESDAY:return DayOfWeek.TUESDAY;
            case THURSDAY:return DayOfWeek.WEDNESDAY;
            case FRIDAY : return DayOfWeek.THURSDAY;
            case SATURDAY:return DayOfWeek.FRIDAY;
            case SUNDAY:return DayOfWeek.SATURDAY;
            default: throw new IllegalStateException();
        }

    }


    // сделать метод который печатает только выходные дни
    public void printDaysOff() {
        for (Day day : days) {
            if (day.getDayOfWeek().isDayOff()) {
                day.printDay();
            }
        }
    }

    private class Day {
        static final String PATTERN = "{0} {1} {2} {3}";
        private int year;
        private int numberInMonth;
        private DayOfWeek dayOfWeek;
        private MonthName monthName;
        private boolean hollyDay;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getNumberInMonth() {
            return numberInMonth;
        }

        public void setNumberInMonth(int numberInMonth) {
            this.numberInMonth = numberInMonth;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }

        public MonthName getMonthName() {
            return monthName;
        }

        public void setMonthName(MonthName monthName) {
            this.monthName = monthName;
        }

        public boolean isHollyDay() {
            return hollyDay;
        }

        public void setHollyDay(boolean hollyDay) {
            this.hollyDay = hollyDay;
        }

        public void printDay() {

            String result = MessageFormat.format(PATTERN, dayOfWeek.getName(), numberInMonth, monthName.getMonthName(), year);
            System.out.println(result);
        }
        // сделать метод который выведет дату в формате ИМЯ_ДНЯ число МЕСЯЦ ГОД message format
    }
}
