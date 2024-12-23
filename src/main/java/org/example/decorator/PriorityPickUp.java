package org.example.decorator;

public class PriorityPickUp extends Decorator{
    private Double price;
    public PriorityPickUp(Ride ride, Double price) {
        super(ride);
        this.price =price;
    }

    @Override
    public String getDescription() {
        return ride.getDescription()+ ", priority pick ";
    }

    @Override
    public Double getPrice() {
        return ride.getPrice() + price;
    }
}
