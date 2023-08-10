package oop.inhr.example_account;

public class Personal extends Account{
    boolean isOpen;
    public Personal() {
    }

    public Personal(String name, int id, int account_no, double amount) {
        super(name, id, account_no, amount);
    }

    @Override
    public void setCurr(String curr) {
        System.out.println("The personal account curr is " + curr);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "isOpen=" + isOpen +
                '}' + " " + super.toString();
    }
}
