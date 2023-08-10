package oop.abstraction.register;

public class Main {
    public static void main(String[] args) {
        Signup signup = new Signup("anis", "anis.siam@hotmail.com", "970595658043", 50);
        signup.pushToDB();

        Login login = new Login("sami", "sami.siam@hotmail.com", "970597758043", 90);
        login.pushToDB();

    }
}
