package com.company;

public class Circle {

    private double r;
    public Circle(double r){
        this.r=r;
    }

    double circumference()
    {
        return 2*3.14*r;
    }
    double area()
    {
        return 3.14*r*r;
    }
    public void setRadius(double p){
        p=r;
    }


}

