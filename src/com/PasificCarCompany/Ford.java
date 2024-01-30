package com.PasificCarCompany;

public class Ford extends Car{
    private long justFord;
    private String type="Ford";
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String accelerate() {
      super.accelerate();
      return getName()+ "is accelerating!";
    }

    @Override
    public String  startEngine() {
      super.startEngine();
      return getName()+" engine is starting!! ";
    }

    @Override
    public String brake() {
        super.brake();
        return getName()+"is breaking";
    }
}
