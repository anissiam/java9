package oop.project;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Panel.welcomeMassage();

        Student[] arrStudent = new Student[10];

        Panel panel = new Panel();


        panel.defultSt();

        int c;
        do {
            System.out.println();
            System.out.println("====================================================================");
            System.out.println("1-Add Student\n2-Show Student\n3-Show All Student\n4-Update Student\n" + "5-Delete Student\n6-Order Student by Age\n7-Get all Success student");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    panel.addStudent();

                    break;
                case 2:
                    panel.showStudent();
                    break;
                case 3:
                    panel.showAllStudent();
                    break;
                case 4:
                    panel.updateStudent();
                    break;
                case 5:
                    panel.deleteStudent();

                    break;
                case 6:

                    panel.sortArrayByAge();

                    break;
                case 7:
                    panel.getSuccessStudents();
                    break;


            }
        } while (c < 8);
    }
}
