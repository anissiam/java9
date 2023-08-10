package oop.inhr.example_account;

public class Account {
    private String name;
    private int id;
    private int account_no;
    private double amount;

    public Account() {
    }

    public Account(String name, int id, int account_no, double amount) {
        this.name = name;
        this.id = id;
        this.account_no = account_no;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurr(String curr){
        System.out.println("Account curr");
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", account_no=" + account_no +
                ", amount=" + amount +
                '}';
    }
}
