package com.example.applicants.businessLogic;

public class VehicleTypeFactor {

    public double calculateVehicleTypeFactor(String vehicleType){

        double typeFactor = 0.0;

        if (vehicleType.equalsIgnoreCase("cabriolet")){
            return typeFactor = 1.3;
        }
        else if(vehicleType.equalsIgnoreCase("coupe")){
            return typeFactor = 1.4;
        }
        else if(vehicleType.equalsIgnoreCase("estate")){
            return typeFactor = 1.5;
        }
        else if(vehicleType.equalsIgnoreCase("hatchback")){
            return typeFactor = 1.6;
        }
        else if(vehicleType.equalsIgnoreCase("other")){
            return typeFactor = 1.7;
        }
        else{
            throw new IllegalArgumentException("Invalid Vehicle Type Exception");
        }
    }
}
