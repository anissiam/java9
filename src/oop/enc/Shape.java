package oop.enc;

public class Shape {
    private int width;
    private int height;
    private String name;

    public Shape() {
    }

    public Shape(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }
    public void setName(String  name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
