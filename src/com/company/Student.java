package com.company;

public class Student extends Person{
    private int studentNum;
    private double marks;

    public Student()
    {
        super();
        this.studentNum=studentNum;
        this.marks=marks;

    }

    public Student(String firstName, String lastName, int sinNum, int studentNum, double marks) {
        super(firstName, lastName, sinNum);
        this.studentNum = studentNum;
        this.marks = marks;
    }

    public void setStudentNum(int studentNum)
    {
        this.studentNum=studentNum;
    }
    public int getStudentNum()
    {
        return studentNum;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public void disp(){
        super.disp();
        System.out.println("Student number "+studentNum);
        System.out.println("Student marks are "+marks);
    }

}
