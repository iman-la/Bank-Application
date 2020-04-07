package com.company;

public abstract class Account implements IBaseRate {

    //list common properties for saving and checking account
    private String Name;
    private String sSN;
    private double balance;


    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties

    public Account(String name, String sSN, double initDeposit) {
        this.Name = name;
        this.sSN = sSN;
        balance = initDeposit + 100;

        //set Account Number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {

        double accruedInterest = balance * (rate / 100);

        balance = balance + accruedInterest;

        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }


    //common methods-transactions

    public void deposit(double amount) {

        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withraw(double amount) {
        balance = balance - amount;
        System.out.println("Withrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);

    }

    public void showInfo() {
        System.out.println("Name: " + Name
                + "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance + "\nRate: " + rate + "%");
    }

}
