package com.example.applicants.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineSizeFactorTest {

    //Set up test variables
    String validEngineSize, invalidEngineSize;

    //Instantuation of method
    EngineSizeFactor engineSizeFactor;

    @BeforeEach
    void setUp() throws IllegalArgumentException {

        validEngineSize = "1000";
        invalidEngineSize = "Invalid";

        //engineSizeFactor Object
        engineSizeFactor = new EngineSizeFactor();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void engineSizeFactorValid() {

        double expectedResult = 1.0;

        double actualResult = engineSizeFactor.engineSizeFactor(validEngineSize);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void calculateEngineSizeFactorInvalid() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {engineSizeFactor.engineSizeFactor(invalidEngineSize);});

    }
}