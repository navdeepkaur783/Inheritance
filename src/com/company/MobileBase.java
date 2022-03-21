package com.company;

abstract public class MobileBase {
    private String modelName;
    private int price;
    public MobileBase()
    {
        System.out.println("Constructing Mobilebase");
    }
    public MobileBase(String name,int rate)
    {
        modelName=name;
        price=rate;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void calPrice(); // abstract method

    public String getModelName() {
        return modelName;
    }



    public int getPrice() {
        return price;
    }


}
