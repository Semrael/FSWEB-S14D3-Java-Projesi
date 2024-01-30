package com.workintech;

public class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+":"+"The Mitsubishi's is accelerating.");

    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+":"+"The Mitsubishi's engine is strating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+":"+"The Mitsubishi is braking.");
    }
    }

