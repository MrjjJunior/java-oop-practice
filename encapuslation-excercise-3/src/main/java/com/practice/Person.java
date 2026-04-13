package com.practice;

public class Person {

    // TODO: add private fields
    private String name;
    private int age;
    private double height;

    Person() {
       this.name = name;
       this.age = age;
       this.height = height;

    }

    // TODO: implement setters

    public void setName(String s) {
        this.name = s;
    }

    public void setAge(int i) {if (i > 0 && i <130)this.age = i;}

    public void setHeight (double h) { if (h >0 && h < 300)this.height = h;}
    // TODO: implement getters

    public String getName() {return this.name;}

    public int getAge() {
        return this.age;
    }
    public double getHeight(){
      return this.height;
    }
}