package com.company;

public class Demo {
    public static void main(String[] args) throws NotEligibleException {
        Demo demo=new Demo();
        demo.checkEligibility(15,45);
    }

    public void checkEligibility(int age,int weight) throws NotEligibleException {

        if (age > 25 && weight > 50) {
            System.out.println("Eligible for blood donation");
        } else {
            throw new NotEligibleException("not eligible for donation");
        }
    }

}


class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
