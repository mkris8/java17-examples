package com.examples.patternmatching;

abstract interface Shape {
    public double area();
}

class Circle implements Shape {
    double radius;
    public Circle(double radius) {
        this. radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeCheck {
    public static void main(String[] args) {

        // pattern matching using instanceOf, no explicit object casting needed
        Shape shape = new Circle(2);
        if(shape instanceof Circle circle) {
            System.out.println(circle.area());
        }
        else if(shape instanceof Rectangle rectangle) {
            System.out.println(rectangle.area());
        }
        else {
            System.out.println("Unknown shape..");
        }

    }
}
