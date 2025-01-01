package org.example.strategy.payment;

public class NetBanking implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("make payment through net banking " + amount);
    }
}
