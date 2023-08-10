package oop.abstraction.example_account;

public class Org extends Account{
    @Override
    public void setCurr(String curr) {
        System.out.println(curr);
    }
}
