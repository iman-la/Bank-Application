package com.company;

public class Saving extends Account {

    //List properties
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize

    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //list any methods
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Saving Account Features" + "\n Safety deposit box id: " + safetyDepositBoxID +
                        "\n Safety deposit box key: " + safetyDepositBoxKey);


    }

}
