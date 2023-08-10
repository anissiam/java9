package oop.inhr.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Squre squre = new Squre();
        squre.height = scanner.nextInt();
        squre.width = scanner.nextInt();

        squre.printData();
        System.out.println(squre.area());
        System.out.println(squre.para());

        System.out.println("====================");

        Circle circle = new Circle();
        circle.rad = 15;
        System.out.println(circle.area());
        System.out.println(circle.para());
        circle.printData();

    }
}

