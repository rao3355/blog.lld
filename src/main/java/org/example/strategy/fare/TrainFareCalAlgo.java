package org.example.strategy.fare;

public class TrainFareCalAlgo implements FareCalculator{
    @Override
    public double calculateFare(double distance) {
        System.out.println("Calculating train fare distance: " + distance);
        return distance*2;
    }
}
