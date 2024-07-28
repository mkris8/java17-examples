package com.examples.enhancedswitch;

public class TrafficLight {

    public static void main(String[] args) {
        String light = "Green";
        String action = switch (light) {
            case "Green" -> "proceed";
            case "Red" -> "stop";
            case "yello" ->"wait";
            default -> throw new IllegalArgumentException("Invalid color"+light);
        };

        System.out.println("Light is: "+ light +" action: " +action);
    }

}
