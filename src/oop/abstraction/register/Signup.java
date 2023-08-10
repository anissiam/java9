package oop.abstraction.register;

public class Signup extends User{
    public Signup() {
    }

    public Signup(String name, String email, String phone, double ava) {
        super(name, email, phone, ava);
    }

    @Override
    protected void pushToDB() {
        String id = "Student " + ((int)(Math.random()*100));
        System.out.println("Id :" + id + " Name:" + getName() + " Success");

    }
}
