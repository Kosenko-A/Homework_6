package ru.geekbrains.homeworks;

public class Cat extends Animal{

    public Cat (String type, String name, String colour, int age){
        super(type, name, colour, age);
    }
    int minRun = 100;
    int maxRun = 300;

    int minJump = 1;
    int maxJump = 4;


    @Override
    boolean run( int length){
        boolean logic = false;
        if (length <= maxValueRun(minRun,maxRun)){
            logic = true;
        }
        return logic;
    }

    @Override
    public boolean jump(int length){
        boolean logic = false;
        if (length <= maxValueJump(minJump, maxJump)){
            logic = true;
        }
        return logic;
    }

    @Override
    boolean swim ( int length) {
        return false;
    }

}
