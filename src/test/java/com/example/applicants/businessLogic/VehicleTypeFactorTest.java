package com.example.applicants.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeFactorTest {

    //Set up test variables
    String validCarType, invalidCarType;

    //Instantuation of method
    VehicleTypeFactor vehicleTypeFactor;


    @BeforeEach
    void setUp() throws IllegalArgumentException {

        validCarType = "Hatchback";
        invalidCarType = "Invalid";

        //vehicleTypeFactor Object
        vehicleTypeFactor = new VehicleTypeFactor();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateVehicleTypeFactorValid() {

    double expectedResult = 1.6;

    double actualResult = vehicleTypeFactor.calculateVehicleTypeFactor(validCarType);

    assertEquals(expectedResult, actualResult, 0.1);

    }

    @Test
    void calculateVehicleTypeFactorInvalid() {

    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {vehicleTypeFactor.calculateVehicleTypeFactor(invalidCarType);});

    }
}