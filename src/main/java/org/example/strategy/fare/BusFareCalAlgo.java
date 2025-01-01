package org.example.strategy.fare;

public class BusFareCalAlgo implements FareCalculator{
    @Override
    public double calculateFare(double distance) {
        System.out.println("Calculating bus fare");
        return distance*6;
    }
}
