package com.company;

public class XXIphone extends XIphone{
    public XXIphone(){
        System.out.println("XX Iphone");
    }

    public XXIphone(String name,int rate)
    {
        super(rate,name);
    }

    @Override
    public void calPrice() {
        super.calPrice();
        setPrice(getPrice()+200);
    }
}
