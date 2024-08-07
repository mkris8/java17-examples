package com.examples.optional;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMain {
    public static void main(String[] args) {

        // use Optional with a List
        Optional findIfStartsWithW = List.of("Hello", "World")
                .stream().filter(n -> n.startsWith("W")).findFirst();

        findIfStartsWithW.ifPresent(System.out::println);

        // ex 2
        Optional optional = List.of("Hello", "World")
                                .stream()
                                .filter(n -> n.startsWith("W"))
                .map(String::toUpperCase)
                .findAny();
        optional.ifPresent(System.out::println);

        // Ex 3
        // Using optional, check if an employee has "null" for manager.
        // If manager is null for the employee, assign a default value



    }

}
