package com.CarRDCompany;

public class CarFactory {
    public static void main(String[] args) {
       CarSkeleton electricCar= new ElectricCar("Tesla","Elec Tesla",100,12);
       CarSkeleton hybrisCar=new HybridCar("toyota","tototoo",12,121,12);
       CarSkeleton gasCar=new GasPoweredCar("rest","aklıma gelmiyor",0.1,12);
        System.out.println(electricCar.drive());
        System.out.println(hybrisCar.drive());
        System.out.println(gasCar.drive());
        //printDriveResult(gasCar);
    }

//    private  static void printDriveResult(CarSkeleton carSkeleton){
//        System.out.println(carSkeleton.drive());
//    }
}
