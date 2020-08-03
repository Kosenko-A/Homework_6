package ru.geekbrains.homeworks;

import java.util.Random;

public  abstract class Animal {
    private String name;
    private String colour;
    private int age;
    private String type;

    public Animal (String type, String name, String colour, int age){
        this.type = type;
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    abstract boolean run(int length);

    abstract boolean swim (int length);

    public boolean jump (int height){
        return false;
    };

    public void info (){
        System.out.println(this.type +" "+ this.name+", цвет: "+ this.colour + " " + this.age +" лет" );
    }
    public static  int maxValueRun(int a, int b){
        return (int)(Math.random()*((b-a+1)+a));
    }
    public static  int maxValueJump(int a, int b){
        return (int)(Math.random()*((b-a+1)+a));
    }
    public static  int maxValueSwim(int a, int b){
        return (int)(Math.random()*((b-a+1)+a));
    }
}
