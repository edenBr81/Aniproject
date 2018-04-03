package com.example.aniproject;

public class Monkey extends Animal {
    public Monkey() {

        System.out.println("A monkey is hatched...");
    }

    @Override
    public String sleep() {
        return "A monkey sleeps soundly....";

    }

    @Override
    public String eat() {
        return "A monkey eats...";
    }

}