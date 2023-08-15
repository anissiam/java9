package oop.project;

public class Student {
    private int id;
    private String name;
    private String major;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(int id, String name, String major, int age, double mark) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.age = age;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
