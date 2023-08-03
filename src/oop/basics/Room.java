package oop.basics;

public class Room {
    int width;
    int height;

    public Room() {
    }

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int printArea(){
        int area = height * width;
        return area;
    }
    public void printData(){
        System.out.println("H:" + height + " W:" + width);
    }
}
