package org.example.strategy.fare;

public class WrongApproach {

    public static void main(String[] args) {
        WrongApproach wrongApproach = new WrongApproach();
        int busFare  = wrongApproach.fairCalculator("busFare", 100);
        int trainfare = wrongApproach.fairCalculator("trainFare", 200);
        int taxiFare = wrongApproach.fairCalculator("taxiFare", 300);
        System.out.println("Total bus fare: " + busFare);
        System.out.println("Total train fare: " + trainfare);
        System.out.println("Total taxi fare: " + taxiFare);
    }
    private int fairCalculator(String vehicleType, int distance){
        int result = 0;
        int rate = 0;
        if(vehicleType.equals("busFare")){
            //algo to calculate the bus fare
            rate  = 6*distance;
        }else if(vehicleType.equals("trainFare")){
            //algo to calculate the train fare
            rate  = 10*distance;
        }else if(vehicleType.equals("taxiFare")){
            //algo to calculate the taxi fare
            rate  = 10*distance;
        }else {
            //algo to calculate the default fare
            rate = 5*distance;
        }
        return rate;
    }
}
