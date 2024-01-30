package com.CarRDCompany;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int cylinders;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int cylinders) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public String drive() {
        return "run from Electric car";
    }

    @Override
    public String startEngine() {
        super.startEngine();
        runEngine(this);
        return getName()+" car starting....";
    }


}
