package oop.interfaces;

public class Car2022E extends Car implements Elec {


    @Override
    public void size() {
        System.out.println("6");
    }

    @Override
    public String OS() {
        return "Apple";
    }
}
