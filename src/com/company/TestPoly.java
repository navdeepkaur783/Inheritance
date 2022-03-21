package com.company;

public class TestPoly {
    public static void main(String[] args) {

       /* Iphone iphone,iphone1;
        iphone=new XIphone();
        iphone1=new XXIphone();
        iphone.calPrice();
        iphone1.calPrice();
        System.out.println("Price of XIphone"+iphone.getPrice());
        System.out.println("Price of XXIphone"+iphone1.getPrice());*/

        MobileBase a,b,c;
        a=new Blackberry();
        b=new Samsung();
        c=new Iphone();
        a.calPrice();
        b.calPrice();
        c.calPrice();
        System.out.println("Price of Iphone"+c.getPrice());
        System.out.println("Price of Blackberry"+a.getPrice());
        System.out.println("Price of Samsung"+b.getPrice());
    }
}
