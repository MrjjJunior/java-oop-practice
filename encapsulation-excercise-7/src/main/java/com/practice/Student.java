package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Student {

    private String name = "Unknown";
    private ArrayList<Integer> scores = new ArrayList<>();

    Student() {
        this.name = name;
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addScore(int i) {
        if(i >0 && i<= 100) this.scores.add(i);
    }

    public ArrayList<Integer> getScores() {
        return this.scores;
    }

    public int getAverageScore() {
        if (this.scores.size() == 0){
            return 0;
        }

        int total = 0;
        for(int i: this.scores){
            total += i;
        }
        return total / (this.scores.size());
    }
}
