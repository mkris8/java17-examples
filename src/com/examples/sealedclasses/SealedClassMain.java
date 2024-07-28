package com.examples.sealedclasses;

abstract sealed class Shape permits Circle, Rectangle{
    public abstract double area();
}

final class Circle extends Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}

final class Rectangle extends Shape{

    double length;
    double width;
    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class SealedClassMain{
    public static void main(String[] args) {
        Shape shape = new Circle(2);
        System.out.println("Circle Area: "+shape.area());

        Shape shape1 = new Rectangle(10, 10);
        System.out.println("Rectangle Area: "+ shape1.area());
    }
}