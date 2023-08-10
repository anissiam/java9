package oop.inhr.homework;

public class Circle extends Shape{
    int rad;

    public void  printData(){
        System.out.println(rad);
    }

    public double  area(){
        return 3.14*rad *rad;
    }

    public double  para(){
        return 2*3.14*rad;
    }
}
