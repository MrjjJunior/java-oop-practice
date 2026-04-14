package com.practice;

public class Person {

    // TODO: private fields
    private String name;
    private int age;
    // TODO: default constructor

    Person() {
        this.age = 0;
        this.name = "Unknown";
    }

    // TODO: parameterized constructor
    Person (String name,int age){
        this.name = name;
        if (age > 0) this.age = age;
    }
    // TODO: getters
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    // TODO: setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge (int a){
        if (a > 0) {
            this.age = a;
        }

    }
    // TODO: isAdult()
    public boolean isAdult(){
        if (this.age >= 18) {
            return true;
        }
        return false;
    }

}