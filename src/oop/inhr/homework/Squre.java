package oop.inhr.homework;

public class Squre extends Shape{
    public void  printData(){
        System.out.println(width + "   " + height);
    }

    public int  area(){
        return width * height;
    }

    public int  para(){
        return 4 * height;
    }

}
