package org.example.javacore.enums;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class Main {
    public static void main(String[] args) {
//        Day day = Day.MONDAY;
//
//        switch (day) {
//            case MONDAY:
//                System.out.println("Start of the work week");
//                break;
//            case WEDNESDAY:
//                System.out.println("Midweek");
//                break;
//            case FRIDAY:
//                System.out.println("Almost the weekend!");
//                break;
//            default:
//                System.out.println("It's a regular day");
//        }
//
//        if (day == Day.MONDAY) {
//            System.out.println("Today is Monday");
//        }
//
//        if (day.equals(Day.MONDAY)) {
//            System.out.println("Still Monday");
//        }
//
//        Day tomorrow = Day.TUESDAY;
//        if (day != tomorrow) {
//            System.out.println("Tomorrow is not Monday");
//        }


       // Access all enum constants
        for (Day dayValue : Day.values()) {
            System.out.println(dayValue.name());
        }

        // Get the ordinal value (position) of the enum constant
        Day dayValue = Day.FRIDAY;
        System.out.println(dayValue + " is at index " + dayValue.ordinal());

        // Get enum constant from string
        Day dayFromString = Day.valueOf("MONDAY");
        System.out.println("Enum constant from string: " + dayFromString);

        Day.valueOf("does not exist");
    }
}
