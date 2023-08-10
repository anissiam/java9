package oop.abstraction.shape;

public abstract class Shape {
     protected int width;
    int height;
    String name;
    int rad;

    public abstract void area();
    public abstract double para();
    public void printData(){
        System.out.println(width + "  " + height + "  " + name);
    }

}
