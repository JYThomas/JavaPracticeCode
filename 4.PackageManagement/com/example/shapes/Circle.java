// (Circle类)：

// Circle类隶属于com.example.shapes包
package com.example.shapes;

public class Circle {
    private double radius;
    public static final double PI = 3.14159265358979323846;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}