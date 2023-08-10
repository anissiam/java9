package oop.abstraction.shape;

public class Circle extends Shape{
    @Override
    public void area() {
        System.out.println(3.14 * rad * rad);
    }

    @Override
    public double para() {
        return 2*3.14*rad;
    }
}
