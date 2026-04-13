package com.practice;

public class Person {

    // TODO: add private age field\\
    private int age;
    Person() {
        this.age = age;
    }

    // TODO: implement setter

    public void setAge(int years){
        if (years >0 && years < 105){
            this.age = years;
        }
//        this.age = years;
    }

    // TODO: implement getter

    public int getAge(){
        return this.age;
    }

}