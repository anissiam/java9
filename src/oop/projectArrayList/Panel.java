package oop.projectArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    private static ArrayList<Student> studentArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void addStudent(){
        int id = getId();

        for (Student student:studentArrayList) {
            if (student.getId() == id) {
                do {
                    System.out.println("Plz try new Id ");
                    id = getId();
                } while (student.getId() == id);
            }
        }

        scanner.nextLine();

        System.out.println("Plz add name");
        String name = scanner.nextLine();

        System.out.println("Plz add major");
        String major = scanner.nextLine();


        System.out.println("Plz add age");
        int age = scanner.nextInt();

        System.out.println("Plz add mark");
        double mark = scanner.nextDouble();

        Student student = new Student(id, name, major, age, mark);
        studentArrayList.add(student);

        System.out.println("Added");



    }



    public static void showStudent(){
        int id = getId();
        if (studentArrayList.isEmpty()){
            System.out.println("Not Found");
            return;
        }
        for (Student student:studentArrayList) {
            if (student.getId() == id) {
                System.out.println(student.toString());
            }else {
                System.out.println("Not Found");
            }
        }
    }


    public static void showAllStudent(){
        for (Student student:studentArrayList) {
            System.out.println(student);
        }

    }


    public static void updateStudent(){
        int id = getId();
        if (studentArrayList.isEmpty()){
            System.out.println("Not Found");
            return;
        }
        scanner.nextLine();
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if (student.getId() == id) {
                System.out.println(student.toString());

                System.out.println("Plz enter new Name");
                String name = scanner.nextLine();
                student.setName(name);
                studentArrayList.set(i, student);
                System.out.println("Updated");

            }else {
                System.out.println("Not Found");
            }
        }

    }

    public static void delete(){
        int id = getId();
        if (studentArrayList.isEmpty()){
            System.out.println("Not Found");
            return;
        }

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if (student.getId() == id) {
                studentArrayList.remove(i);
                System.out.println("Deleted");

            }else {
                System.out.println("Not Found");
            }
        }



    }

    private static int getId() {
        System.out.println("Plz add id");
        int id = scanner.nextInt();
        return id;
    }
}
