package oop.projectArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int c;
        do {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("1-Add Student\n2-Show Student\n3-Show All Student\n4-Update Student\n" + "5-Delete Student\n6-Order Student by Age\n7-Get all Success student");
            c = scanner.nextInt();
            switch (c) {
                case 1:

                    Panel.addStudent();

                    break;
                case 2:
                    Panel.showStudent();

                    break;
                case 3:
                    Panel.showAllStudent();
                    break;
                case 4:
                    Panel.updateStudent();
                    break;
                case 5:
                    Panel.delete();

                    break;
                case 6:

                    Panel.orderByAge();

                    break;
                case 7:

                    Panel.getAllSuccess();
                    break;


            }
        } while (c < 8);
    }
}
