package oop.abstraction.register;

public class Login extends User{
    public Login(String name, String email, String phone, double ava) {
        super(name, email, phone, ava);
    }

    @Override
    protected void pushToDB() {
        System.out.println("Name:" + getName() + " Logged in");
    }
}
