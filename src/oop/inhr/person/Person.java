package oop.inhr.person;

public class Person {
    private String name;
    private int age;
    private String major;
    private int hours;

    public Person() {
    }

    public Person(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Person(String name, int age, String major, int hours) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void printData(){
        System.out.println("Person");
    }

    public String print() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", hours=" + hours +
                '}';
    }
}
