package org.example.decorator;

public class ExtraLuggage extends Decorator{
    private Double price;
    public ExtraLuggage(Ride ride, Double price) {
        super(ride);
        price = price;
    }

    @Override
    public String getDescription() {
        return ride.getDescription()+", extra luggage";
    }

    @Override
    public Double getPrice() {
        return ride.getPrice()+price;
    }
}
