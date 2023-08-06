package oop.enc;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("ANis", "CS", 30);
        student.printData();
        student.setAge(20);
        System.out.println(student.getAge());
        student.setName("Sami");
        student.printData();

        /*Car obj = new Car("BMW", "Blue", 200);
        obj.printCar();
        obj.setSpeed(20);
        System.out.println( "The speed is "+ obj.getSpeed());

        obj.printSpeed();*/

       /* Shape shape = new Shape();
        //shape.width = 10;
        shape.setWidth(10);
        System.out.println(shape.getWidth());
        shape.setName("sq");
        System.out.println(shape.getName());


        Shape shape1 = new Shape(10,50,"Rec");


        shape.setName("rectangle");
        System.out.println(shape1.getName());*/

    }
}
