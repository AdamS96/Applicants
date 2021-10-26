package com.example.applicants.businessLogic;

public class AdditionalDriversFactor {

    public double additionalDriversFactor(String additionalDrivers){

        double additionalDriversFactor = 0.0;
        int additionalDriversInt = Integer.parseInt(additionalDrivers);

        if (additionalDriversInt <2){
            return additionalDriversFactor = 1.1;
        }
        else{
            return additionalDriversFactor = 1.2;
        }
    }

}
