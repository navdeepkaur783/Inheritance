package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(ex.getMessage());

        try {
            try {
                int a[] = new int[7];

                System.out.println(a[10]);
            }
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println(ex.getMessage());
            }
            try
            {
                int i=10;
                int j=0;
                int k=i/j;
                System.out.println(k);
            }
            catch (ArithmeticException ex)
            {
                System.out.println(ex.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("finally block execution");
        }

    }
}
