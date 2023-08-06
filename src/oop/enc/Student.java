package oop.enc;

public class Student {
    private String name;
    private String major;
    private int age;

    public Student() {
    }

    public Student(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void printData(){
        System.out.println("Name:" + name + " Age:" + age + " Major:" + major);

    }
}
