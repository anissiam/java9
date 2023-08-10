package oop.enc;

import java.util.stream.StreamSupport;

public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee() {
    }

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Name     Year of joining     Address");
        System.out.println(name + "      " + yearOfJoining + "      " + address);

    }
}
