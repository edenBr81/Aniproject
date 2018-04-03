package com.example.aniproject;

import static jdk.nashorn.internal.objects.Global.print;

public class AnimalApp {
    public static void main(String[] args) {
        Animal a=new Animal();
        print(a.eat());
        print(a.sleep());

    Dog d=new Dog();
    print(d.eat());
    print(d.sleep());
    print(d.bark());

  Monkey m = new Monkey();
        print(m.eat());
        print(m.sleep());

        Fish f= new Fish();
         print(f.eat());
         print(f.swim());



}

    private static void print(String s) {
        System.out.println(s);
    }
    }