package com.company;

public class Samsung extends MobileBase{
    public Samsung()
    {
        System.out.println("constructing samsung");
    }
    public Samsung(String name,int rate)
    {
        super(name,rate);
    }
    @Override
    public void calPrice()
    {
        System.out.println("Price of Iphone");
        setPrice(getPrice()+1500);
    }

}
