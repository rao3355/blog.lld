package org.example.strategy.fare;

public class TaxiFareCalAlgo implements FareCalculator{
    @Override
    public double calculateFare(double distance) {
        System.out.println("Calculating tarin fare for :"+ distance);
        return distance*10;
    }
}
