package oop.enc;

import javax.xml.namespace.QName;

public class Account {
    private String name;
    private String email;
    private double amount;
    private int account_no;
    public Account(){

    }
    public Account(String name , String email , double amount , int account_no){
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.account_no = account_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public void change(){
        double ch = amount / 3.6;
        System.out.println(ch);
    }

    public void printData(){
        System.out.println("Name: " + name + " Email" + email + " Amount:" + amount + " Account no:" + account_no);
    }
}
