package com.company;
public class Test {
    public static void main(String[] args) {
        //Person person=new Person("Navdeep","kaur",4455);
        //Student student=new Student("rahul","Sharma",2445,12,34.6);

        //student.disp();
        InterestRate interestRate=new InterestRate(4000,7,2);
        interestRate.interestPerYear();
        interestRate.calCompoundInterest();

    }
}
