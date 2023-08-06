package oop.enc;

public class Car {
    private String name;
    private String color;
    private int speed;



    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void printSpeed(){
        for (int i = 0; i <speed ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public void printCar(){
        System.out.println("Name:" + name + " Color:" + color + " Speed:" + speed);
    }
}
