package oop.basics;

public class Exceptions {
    static Car car;
    public static void main(String[] args) {


        try {
            System.out.println(car.name); //trow

        } catch (Exception e) {
            System.out.print(e);

        }


        System.out.println("Done");
    }
}
