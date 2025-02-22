package org.example.javafeatures.java1221;

sealed class Shape permits Circle, Polygon, Rectangle {}

final class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
}

public final class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
final class Polygon extends Shape {

}