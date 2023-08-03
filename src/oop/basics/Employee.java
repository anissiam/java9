package oop.basics;

public class Employee {
    String name;
    int age;
    String major;

    public Employee(){
        System.out.println("init");
    }

    public Employee(String  name , int age , String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    void addName(String name){
       this.name=name;
    }

    void printEmployee(){
        System.out.println(name + " " + age + " " + major);
    }
}
