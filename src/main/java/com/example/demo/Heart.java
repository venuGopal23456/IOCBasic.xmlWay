package com.example.demo1;

public class Heart {

    private String name;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void getBeating()
    {
        System.out.println("Heart is Beating");
    }
}
