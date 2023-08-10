package oop.inhr.example;

public class Squre extends Shape {


    public Squre() {
    }

    public Squre(int width, int height) {
        super(width, height);
    }

    public void  printData(){
        System.out.println(getWidth() + "   " + getHeight());
    }

    public int  area(){
        return getWidth() * getHeight();
    }

    public int  para(){
        return 4 * getHeight();
    }

}
