package oop.inhr.example;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(int rad) {
        super(rad);
    }

    public void  printData(){
        System.out.println(getRad());
    }

    public double  area(){
        return 3.14*getRad() *getRad();
    }

    public double  para(){
        return 2*3.14*getRad();
    }
}
