package oop.interfaces;

public class Car2023E extends Car implements Elec{

    @Override
    public void size() {
        System.out.println("8");
    }

    @Override
    public String OS() {
        return "android";
    }
}
