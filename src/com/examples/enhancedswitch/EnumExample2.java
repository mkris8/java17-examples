package com.examples.enhancedswitch;

public class EnumExample2 {

    public static void main(String[] args) {
        String day = "SUNDAY";
        String typeOfDay = switch (day)  {
            case "MONDAY" , "Tuesday" , "Wednesday" , "Thursday", "Friday"-> "weekday";
            case "SATURDAY", "SUNDAY" ->"Weekeknd";
            default ->  throw new IllegalArgumentException("Invalid day");
        };

        System.out.println(day + " is " +typeOfDay);
    }
}
