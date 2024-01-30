package com.workintech;

public class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+":"+"The Holden's is accelerating.");

    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+":"+"The Holden's engine is strating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+":"+"The Holden is braking.");
    }
}
