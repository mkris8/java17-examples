package com.examples.enhancedswitch;

enum DAY {
    SUNDAY,
    MONDAY;
}

public class EnumExample1 {
    public static void main(String[] args) {
        switch (DAY.SUNDAY){
            case MONDAY -> System.out.println("got a monday");
            case SUNDAY -> System.out.println("got a sunday");
        }
    }
}
