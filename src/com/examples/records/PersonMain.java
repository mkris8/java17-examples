package com.examples.records;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John", 10);
        person.greet(); // can call custom method
        System.out.println(person); // record automatically generates the toString
    }
}
