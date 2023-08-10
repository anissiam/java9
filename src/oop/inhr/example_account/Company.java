package oop.inhr.example_account;

public class Company extends Account{
    public Company() {
    }

    public Company(String name, int id, int account_no, double amount) {
        super(name, id, account_no, amount);
    }

    @Override
    public void setCurr(String curr) {
        System.out.println("The company account curr is " + curr);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
