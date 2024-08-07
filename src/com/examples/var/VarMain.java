package com.examples.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VarMain {
    public static void main(String[] args) {
        var myString = "Hello";
        var number = 10;
        var mylist = new ArrayList<String>();
        mylist.add("test");
        var map = new HashMap<String, String>();
        map.put("Hello","map");

        System.out.println(myString);
        System.out.println(number);
        System.out.println(mylist);
        System.out.println(map);

        // var with lambda
        var list = List.of("Hello", "List");
        list.forEach(item -> System.out.println(item));

        list.forEach(name -> {
            var uppername = name.toUpperCase();
            System.out.println(uppername);
        });

        //var with enhanced for loop
        var list2 = List.of("Hello", "For");
        for (var s : list2) { // var inferred as a string
            System.out.println(s);
        }

    }
}
