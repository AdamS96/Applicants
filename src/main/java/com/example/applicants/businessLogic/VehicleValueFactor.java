package com.example.applicants.businessLogic;

public class VehicleValueFactor {

    public double vehicleValueFactor(String currentValue){

        double vehicleValueFactor = 0.0;

        int vehicleValueInt = Integer.parseInt(currentValue);

        if (vehicleValueInt <= 5000){
            return vehicleValueFactor = 1.0;
        }else{
            return vehicleValueFactor = 1.2;
        }
    }
}
