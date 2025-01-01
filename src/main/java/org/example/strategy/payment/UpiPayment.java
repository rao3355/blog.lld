package org.example.strategy.payment;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("makeing payment through upi : " + amount);
    }
}
