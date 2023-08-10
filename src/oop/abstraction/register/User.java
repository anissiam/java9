package oop.abstraction.register;

public abstract class User {
    private String name;
    private String email;
    private String phone;
    private double ava;

    public User() {
    }

    public User(String name, String email, String phone, double ava) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.ava = ava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAva() {
        return ava;
    }

    public void setAva(double ava) {
        this.ava = ava;
    }

    protected abstract void pushToDB();


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", ava=" + ava +
                '}';
    }
}
