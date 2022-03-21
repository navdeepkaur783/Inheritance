package com.company;

public class Blackberry extends MobileBase {
    public Blackberry()
    {
        System.out.println("Blackberry constructing");
    }
    public Blackberry(String name,int rate){
        super(name,rate);
    }
    @Override
    public void calPrice(){
        setPrice(getPrice()+1000);
    }
}
