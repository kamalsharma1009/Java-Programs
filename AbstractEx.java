// Abstract class
import java.util.Scanner;

abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Circle class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class AbstractEx {
    public static void main(String[] args) {
        Shape circle = new Circle(5);            // radius = 5
        Shape rectangle = new Rectangle(4, 6);   // length = 4, width = 6

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}