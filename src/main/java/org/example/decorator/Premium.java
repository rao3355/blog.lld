package org.example.decorator;

public class Premium implements Ride{
    private Double price;

    public Premium(double price){
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "cost of premium ride";
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
