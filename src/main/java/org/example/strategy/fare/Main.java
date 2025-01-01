package org.example.strategy.fare;

public class Main {
    public static void main(String[] args) {
        FareCalculator busFareCal = new BusFareCalAlgo();
        FareProcessor fp = new FareProcessor(busFareCal);
        double fare = fp.fareCal(100);
        System.out.println("Bus fare for 100 km: " + fare);

        FareCalculator trainFareCalAlgo = new TrainFareCalAlgo();
        FareProcessor trainFareProcessor = new FareProcessor(trainFareCalAlgo);
        double trainFare = trainFareProcessor.fareCal(150);
        System.out.println("Train fare for 150 km: " + trainFare);

        FareCalculator taxiFareCal = new TaxiFareCalAlgo();
        FareProcessor taxiFareProcessor = new FareProcessor(taxiFareCal);
        double taxiFare = taxiFareProcessor.fareCal(200);
        System.out.println("Taxi fare for 200 km: " + taxiFare);

    }
}
