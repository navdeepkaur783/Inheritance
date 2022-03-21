package com.company;

public class InterestRate implements Account,CompoundInterest {
    int rate;
    double balance;
    int noOfYears;

    public InterestRate(double balance, int rate,int noOfYears) {
        this.balance = balance;
        this.rate = rate;
        this.noOfYears=noOfYears;
    }


    @Override
    public void interestPerYear() {
        System.out.println((balance*rate*noOfYears)/100);
    }

    @Override
    public void calCompoundInterest() {
        double compoundInterest=balance*Math.pow(1.0+rate/100.0,noOfYears)-balance;
        System.out.println(compoundInterest);
    }
}
