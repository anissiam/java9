package oop.inhr.example_account;



public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal("anis", 1, 1111, 200);
        personal.setCurr("INS");
        System.out.println(personal.toString());
    }
}
