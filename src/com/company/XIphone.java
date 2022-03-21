package com.company;

public class XIphone extends Iphone {
    public XIphone()
    {
        System.out.println("XIphone constructor");
    }
    public XIphone(int rate, String name)

    {
        super(name, rate);
    }
    @Override
    public void calPrice()
    {
        super.calPrice();
        System.out.println("Price of XIPhone");
        setPrice(getPrice()+200);
    }



}
