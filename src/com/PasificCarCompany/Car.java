package com.PasificCarCompany;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name ,int cylinders) {
        this.name = name;
        this.cylinders=cylinders;
        this.engine=Boolean.TRUE;
        this.wheels=4;

    }

    public String startEngine(){
        printSimpleName();
        return "The car's engine is strating";

    }
    public String  accelerate(){
     printSimpleName();
     return "The car's is accelerating.";
    }
    public String brake(){
       printSimpleName();
       return "The car is braking.";
    }

    private void logMessage(String message){
        System.out.println(message);
    }
    //Bu şekilde tek seferde almak daha kulanışlı
    private void printSimpleName(){
        System.out.println("Class name:"+getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
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
