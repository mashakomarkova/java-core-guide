package org.example.javacore.enums;

public class Test {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        System.out.println(Day.TUESDAY == day);
        System.out.println(Day.TUESDAY.equals(day));
    }
}
