package oop.basics.homework;

public class Shape {
    int width;
    int height;
    String name;

    public Shape() {
    }

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    Shape(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }
    public void area(){
        int area = width * height;
        System.out.println(area);
    }

    /*public int area(){
        int area = width * height;
        return area;
    }*/
}
