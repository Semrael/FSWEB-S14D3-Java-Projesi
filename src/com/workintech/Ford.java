package com.workintech;

public class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+":"+"The Ford's  accelerate");


    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+":"+"The Ford's is strating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+":"+"The Ford is braking.");
    }
}
