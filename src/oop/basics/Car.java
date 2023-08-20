package oop.basics;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
     public String color;
   public int maxSpeed;

    public void printCar(){
        System.out.println("Name:" + name + " Color:" + color + " Speed:" + maxSpeed);
    }
}
