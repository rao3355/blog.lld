package org.example.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("making payment through cc: " + amount);
    }
}
