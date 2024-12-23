package org.example.decorator;

public abstract  class Decorator implements Ride {
    protected Ride ride;
    public Decorator(Ride ride) {
        this.ride = ride;
    }
}
