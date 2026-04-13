package com.practice;

public class Person {

    // TODO: private fields
    private String name ;
    private int age;
    private double height;
    private double weight;

    Person() {
        this.name = name;
        this.age = age ;
        this.height = height;
        this.weight = weight;
    }
    // TODO: getters
    public String getName(){ return this.name;}

    public int getAge(){return this.age;}

    public double getHeight() {return this.height;}

    public double getWeight() {return this.weight;}

    // TODO: setters
    public void setName(String name){this.name = name;}

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }

    public void setHeight(double height ) {this.height = height;}

    public void setWeight(double weight ) {this.weight = weight;}
    // TODO: implement isAdult()

    public boolean isAdult(){
        if (this.age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    // TODO: implement calculateBMI()
    public double calculateBMI(){
        /*
        * weight / (height * height)
        * */
        return this.weight/(height * height) ;
    }
}