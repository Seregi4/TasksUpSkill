package main;

public enum MonthName implements CounterDayOfMonth {

    JANUARY() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    FEBRUARY() {
        @Override
        public int getDaysCount(int numberOfYear) {
            int day;
            if (numberOfYear % 4 == 0 || numberOfYear % 100 == 0 || numberOfYear % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }
            return day;
        }
    },
    MARCH() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    APRIL() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 30;
        }
    },
    MAY() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    JUNE() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 30;
        }
    },
    JULY() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    AUGUST() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    SEPTEMBER() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 30;
        }
    },
    OCTOBER() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    },
    NOVEMBER() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 30;
        }
    },
    DECEMBER() {
        @Override
        public int getDaysCount(int numberOfYear) {

            return 31;
        }
    };


    public String getMonthName() {

       return name();
    }
}
