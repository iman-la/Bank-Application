package com.company;

public class Checking extends Account {

    //list properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;


    //Constructor to initialize


    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
        System.out.println("CARD: " + this.debitCardNumber);
        System.out.println("PIN: " + this.debitCardPin);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }

}
