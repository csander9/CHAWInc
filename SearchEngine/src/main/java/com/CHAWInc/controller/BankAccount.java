package com.CHAWInc.controller;

public class BankAccount {

    Customer C;
    double AccountBalance;

    public BankAccount(String firstName, String lastName);
    {
        AccountBalance = 0.0;
        C = new Customer(firstName, lastName);
    }
    public BankAccount(Customer c)
    {
        AccountBalance = 0.0;
        C = new Customer(c.firstname, c.lastname);
    }
    public void deposit(double amount)
    {
        AccountBalance += amount;
    }
    public void withdraw(double amount)
    {
        AccountBalance -= amount;
    }
    public String getCustomer()
    {
        return c.toString();
    }
    public double getBalance()
    {
        return AccountBalance;
    }
    //now we DISPLAY the account as a string not a number
    public String toString() {
        String res;
        res = "Customer name: " + C.toString() + "AcccountBalance: " + this.AccountBalance;
        return res;
    }
    }

}
