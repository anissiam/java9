package oop.basics;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Room myRoom = new Room(10, 50);

        System.out.println(myRoom.printArea());
        myRoom.printData();

        /*Scanner scanner = new Scanner(System.in);

        Employee employee ;
        System.out.print("Name:");
        String s = scanner.nextLine();

        System.out.print("Major:");
        String m = scanner.nextLine();

        System.out.print("Age:");
        int a = scanner.nextInt();
        employee = new Employee(s, a, m);

        employee.printEmployee();

        System.out.println("=========");

        Employee employee1 = new Employee();
        employee1.addName("sami");
        employee1.printEmployee();

        System.out.println("=========");


        Employee employee2 = new Employee("ali", 20, "CS");
        employee2.printEmployee();*/

    }
}
