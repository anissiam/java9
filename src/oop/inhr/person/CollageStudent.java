package oop.inhr.person;

public class CollageStudent extends Person{
    public CollageStudent() {
    }

    public CollageStudent(String name, int age, String major, int hours) {
        super(name, age, major, hours);
    }
    public void printData(){
        System.out.println(getName() + " " + getAge());
    }
}
