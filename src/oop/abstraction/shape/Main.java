package oop.abstraction.shape;

public class Main {
    public static void main(String[] args) {
        Squre squre = new Squre();
        squre.width = 10;
        squre.height = 10;
        squre.printData();
        squre.area();


        Circle circle = new Circle();
        circle.rad = 5;
        circle.area();
        System.out.println(circle.para());

    }
}
