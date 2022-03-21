package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int sinNum;

    public Person() {
        this.firstName=firstName;
        this.lastName=lastName;
        this.sinNum=sinNum;
    }

    public Person(String firstName, String lastName, int sinNum){
        this.firstName=firstName;
        this.lastName=lastName;
        this.sinNum=sinNum;
    }


    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public void getSinNum(int sinNum) {
        this.sinNum=sinNum;
    }
    public int setSinNum()
    {
        return sinNum;
    }

    public void disp()
    {
        System.out.println("Name of the person is "+firstName+" "+lastName);
        System.out.println("Sin number is "+ sinNum);
    }
}
