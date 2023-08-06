package oop.basics.homework;

public class Circle {
    double rad = 1.0;
    String color = "red";

    public Circle() {
    }

    public Circle(double rad) {
        this.rad = rad;
    }

    double getRad(){
        return rad;
    }

    double getArea(){
        return Math.PI * rad * rad;
    }
}
