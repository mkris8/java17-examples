package com.examples.records;

public record Person(String name , int age) {
    public void greet() {
        System.out.println("Hello: " +name +age);
    }
}
