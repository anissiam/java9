package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Car2022E car2022E = new Car2022E();
        System.out.println(car2022E.OS());
        car2022E.size();


        Car2023E car2023E = new Car2023E();
        System.out.println(car2023E.OS());
        car2023E.size();


        Car2025 car2025 = new Car2025();
        System.out.println(car2025.solorNumber(10));
       // System.out.println(car2025.OS());
    }
}
