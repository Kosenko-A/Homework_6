package ru.geekbrains.homeworks;

public class Dog extends Animal{
    public Dog (String type, String name, String colour, int age){
        super(type, name, colour, age);
    }

    int minRun = 400;
    int maxRun = 600;

    int minJump = 0;
    int maxJump = 2;

    int minSwim = 5;
    int maxSwim = 2;

    @Override
    boolean run( int length){
        boolean logic = false;
        if (length <= maxValueRun(minRun,maxRun)){
            logic = true;
        }
        return logic;
    }


    public boolean jump(double length){
        boolean logic = false;
        if (length <= maxValueJump(minJump, maxJump)){
            logic = true;
        }
        return logic;
    }

    @Override
        boolean swim ( int length){
        boolean logic = false;
        if (length <= maxValueSwim(minSwim, maxSwim)){
            logic = true;
        }
        return logic;
    }
}
