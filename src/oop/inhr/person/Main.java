package oop.inhr.person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.printData();

        CollageStudent collageStudent = new CollageStudent("anis", 30, "CS", 200);
        System.out.println(collageStudent.print());

        SchoolStudent student = new SchoolStudent("sami", 20, "IT");
        System.out.println(student.print());
        student.printData();


    }
}
