package com.example.applicants.businessLogic;

public class OutsideStateFactor {

    public double outsideStateFactor(String usedOutsideState) {

        double outsideStateFactor = 0.0;

        if (usedOutsideState.equalsIgnoreCase("Yes")) {
            return outsideStateFactor = 1.1;
        } else if (usedOutsideState.equalsIgnoreCase("No")) {
            return outsideStateFactor = 1.0;
        } else {
            return outsideStateFactor = 0.0;
        }
    }
}
