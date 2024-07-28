package com.examples.patternmatching;

abstract interface Animal{
    public void makenoise();
}

class Cat implements Animal {
    String noise;
    public Cat(String noise){
        this.noise = noise;
    }

    @Override
    public void makenoise() {
        System.out.println("cat noise: "+ noise);
    }
}

public class AnimalCheck {

    public static void main(String[] args) {
        Animal animal = new Cat("meow");

        // instanceOf pattern matching
        if(animal instanceof Cat cat) {
            animal.makenoise();
        }

    }
}
