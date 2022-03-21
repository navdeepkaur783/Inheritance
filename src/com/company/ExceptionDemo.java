package com.company;

public class ExceptionDemo {
    public static void main(String[] args) {
       try {
           int a[]=new int[4];
           System.out.println(a[7]);
           a[3]=40/0;
           //System.out.println(a[3]);
       }
       catch(ArithmeticException ae)
       {
           //ae.printStackTrace();
           System.out.println(ae.getMessage());
       }
       catch (ArrayIndexOutOfBoundsException ex)
       {
           //ex.printStackTrace();
           System.out.println(ex.getMessage());
       }
       catch (Exception e)
       {
           //e.printStackTrace();
           System.out.println(e.getMessage());
       }
    }
}
