package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        Ride economy = new Economy(5d);
        System.out.println(economy.getDescription());
        System.out.println(economy.getPrice());

        economy = new PriorityPickUp(economy, 3d);
        System.out.println(economy.getDescription());
        System.out.println(economy.getPrice());

        Ride premium = new Premium(8d);
        System.out.println(premium.getDescription());
        System.out.println(premium.getPrice());

        premium = new PriorityPickUp(premium, 4d);
        System.out.println(premium.getDescription());
        System.out.println(premium.getPrice());
    }
}
