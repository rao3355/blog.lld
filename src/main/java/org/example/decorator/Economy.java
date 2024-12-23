package org.example.decorator;

public class Economy implements Ride{
    private String description;
    private Double price;
    public Economy(Double price) {
        this.description = "";
        this.price = price;
    }
    @Override
    public String getDescription() {
        description = "cost of economy";
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
