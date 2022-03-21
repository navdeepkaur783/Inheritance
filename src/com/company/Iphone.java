package com.company;

public class Iphone extends MobileBase{
    public Iphone(){
        System.out.println("Constructing Iphone");
    }
    public Iphone(String name,int rate)
    {
        super(name,rate);
    }
    @Override
    public void calPrice()
    {
        System.out.println("Price of Iphone");
        setPrice(getPrice()+2000);
    }

}
