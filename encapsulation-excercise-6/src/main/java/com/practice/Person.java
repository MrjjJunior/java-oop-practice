package com.practice;

public class Person {

    private String name = "Unknown";
    private int age = 0 ;
    private static int numberOfPeople = 0;

    Person () {
        this.name = name;
        if (age > 0 && age < 130){
            this.age = age;
        }
        numberOfPeople += 1;
    }
    Person(String name, int age) {
        this.name = name;
        if (age > 0 && age < 130){
            this.age = age;
        }
        numberOfPeople +=1;
    }

    public static int getTotalPeople() {
        return numberOfPeople;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int i) {
        if (i > 0 && i < 130 ){
            this.age = i;
        }
    }

    // TODO: instance fields

    // TODO: static field

    // TODO: constructors

    // TODO: getters/setters

    // TODO: static getter for totalPeople

}