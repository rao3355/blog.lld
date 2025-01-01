package org.example.strategy.payment;

public class PaymentProcessor {
    private PaymentStrategy payment;
    public PaymentProcessor(PaymentStrategy payment) {
        this.payment = payment;
    }
    void doPayment(double amount){
        payment.pay(amount);
    }


}
