package oop.project;

import java.util.*;

public class Panel {
    Scanner scanner = new Scanner(System.in);
    Student[] arrStudent = new Student[10];


    public static void welcomeMassage(){
        System.out.println("========Student panel========");
    }

    public void defultSt(){
        Student student0 = new Student(0, "mosa", "cs", 10, 70);
        Student student3 = new Student(1, "anis", "It", 20, 80);
        Student student5 = new Student(2, "mohammed", "AI", 15, 30);
        Student student = new Student(3, "sami", "cs", 10, 90);
        Student student1 = new Student(4, "Sara", "It", 20, 20);
        Student student2 = new Student(5, "Ali", "AI", 15, 10);
        arrStudent[0] = student0;
        arrStudent[1] = student3;
        arrStudent[2] = student5;
        arrStudent[3] = student;
        arrStudent[4] = student1;
        arrStudent[5] = student2;

    }

    public void addStudent() {
        int id = getId();

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

        arrStudent[id] = student;

        System.out.println("Added");
    }


    public void showStudent() {
        int id = getId();
        String result = arrStudent[id]!=null?arrStudent[id].toString():"not found";

        System.out.println(result);
       /* if (arrStudent[id] != null)
            System.out.println(arrStudent[id]);
        else
            System.out.println("Not found");*/
    }

    public void showAllStudent(){
        for (int i = 0; i < arrStudent.length; i++) {
            if (arrStudent[i]!=null){
                System.out.println(arrStudent[i]);
            }
        }
    }

    public void updateStudent(){
        Student student  ;
        int id = getId();
        int result = arrStudent[id] != null ? 1 : 0;
        if (result==1){
            student = arrStudent[id];
            System.out.println("1)name\n2)age\n3)major\n4)mark");
            int c = scanner.nextInt();
            scanner.nextLine();
            switch (c){
                case 1:
                    System.out.println("Plz add name");
                    String name = scanner.nextLine();
                    student.setName(name);
                    break;

                case 2 :
                    System.out.println("Plz add age");
                    int age = scanner.nextInt();
                    student.setAge(age);
                    break;
                case 3:
                    System.out.println("Plz add major");
                    String major = scanner.nextLine();
                    student.setMajor(major);
                    break;
                case  4 :
                    System.out.println("Plz add mark");
                    double mark = scanner.nextDouble();
                    student.setMark(mark);

                    break;
                default:
                    break;
            }
            System.out.println("Updated");

        }else {
            System.out.println("Not found");
        }

    }

    public void deleteStudent(){
        int id = getId();
        int result = arrStudent[id] != null ? 1 : 0;
        if (result!=0){
            arrStudent[id] =null;
        }else {
            System.out.println("Not found");
        }
    }

    public void sortArrayByAge(){

        Arrays.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if (o1!=null && o2!=null){
                    return Integer.compare(o1.getAge(), o2.getAge());
                }else {
                    return 0;
                }

            }
        });

    }

    public void getSuccessStudents(){
        int successCount = 0;
        for (int i = 0; i < arrStudent.length; i++) {
            if (arrStudent[i]!=null){
                if (arrStudent[i].getMark()>=50){
                    successCount++;
                }
            }
        }
        System.out.println("=============================");
        Student[] success = new Student[successCount];

        Arrays.sort(arrStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if (o1!=null && o2!=null){
                    return Double.compare(o1.getMark(), o2.getMark());
                }else {
                    return 0;
                }

            }
        });

        int count = 0;
        for (int i = successCount; i < arrStudent.length; i++) {
            if (arrStudent[i]!=null){
                success[count] = arrStudent[i];
                count++;
            }
        }

        for (int i = 0; i < success.length; i++) {
            if (success[i]!=null){
                System.out.println(success[i]);
            }
        }


    }

    private int getId() {
        System.out.println("Plz add id");
        int id = scanner.nextInt();
        return id;
    }


}
