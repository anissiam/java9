package oop.basics;

public class Person {
    String name;
    int age;
    String major;
    double tall;
    Animal animal;
    Address address;
    void printData(){
        System.out.println("Name:" + name + " Age:" + age + " major:" + major + " Tall:" + tall);
    }
}

class  Address{
    String city;
}
