package org.example.strategy.fare;

public class FareProcessor {
    private FareCalculator fareStrategy;
    public FareProcessor(FareCalculator fareStrategy){
        this.fareStrategy = fareStrategy;
    }

    double fareCal(int amount){
        return fareStrategy.calculateFare(amount);
    }

}
