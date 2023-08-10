package oop.abstraction.shape;

public class Squre extends Shape{

    @Override
    public void area() {
        System.out.println(width * height);
    }

    @Override
    public double para() {
        return 4*width;
    }

    @Override
    public void printData() {
        super.printData();
    }
}
