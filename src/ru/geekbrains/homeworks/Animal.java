package ru.geekbrains.homeworks;

public abstract class Animal {
    private String name;
    private String colour;
    private int age;

    public Animal (String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    abstract boolean run(int length);
    abstract boolean jump (int height);
    abstract boolean swim (int length);
}
