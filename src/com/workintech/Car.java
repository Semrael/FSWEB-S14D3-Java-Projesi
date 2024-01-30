package com.workintech;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name ,int cylinders) {
        this.name = name;
        this.cylinders=cylinders;
        this.engine=true;
        this.wheels=4;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName()+":"+"The car's engine is strating");

    }
    public void accelerate(){
        System.out.println(getClass().getSimpleName()+":"+"The car's is accelerating.");
    }
    public void brake(){
        System.out.println(getClass().getSimpleName()+":"+"The car is braking.");
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }



    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
