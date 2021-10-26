package com.example.applicants.businessLogic;

public class BusinessLogic {

    public double calculateQuote(Double typeFactor, Double engineSizeFactor, Double additionalDriversFactor, Double commericalUseFactor, Double outsideStateFactor, Double vehicleValueFactor){

        return (100 * typeFactor * engineSizeFactor * additionalDriversFactor * commericalUseFactor * outsideStateFactor * vehicleValueFactor);

    }
}
