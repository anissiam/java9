package oop.inhr.person;

public class SchoolStudent extends Person{
    public SchoolStudent() {
    }

    public SchoolStudent(String name, int age, String major) {
        super(name, age, major);
    }

    @Override
    public void printData() {
        System.out.println("Meowwwwwwwwwwwwwww");
    }
}
