package com.company;

public interface IBaseRate {

    //write a method that return a base rate

    default double getBaseRate() {
        return 2.5;
    }



}
