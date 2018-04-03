package com.example.aniproject;

public class Fish extends Animal{
    public Fish()
    {
        System.out.println("A fish is... ");

    }

    @Override
    public  String swim(){
        return "A Fish swim.....";
    }
    @Override
    public  String eat(){
        return "A fish eats...";
    }

}
