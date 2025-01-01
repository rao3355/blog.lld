package org.example.strategy.payment;

public class Main {
    public static void main(String[] args) {
        //credit card
        PaymentStrategy strategy =  new CreditCardPayment();
        PaymentProcessor payment = new PaymentProcessor(strategy);
        payment.doPayment(4);

        PaymentStrategy netBankingStrategy =  new NetBanking();
        PaymentProcessor netBank = new PaymentProcessor(netBankingStrategy);
        netBank.doPayment(5);

        PaymentStrategy Upistrategy =  new UpiPayment();
        PaymentProcessor upi = new PaymentProcessor(Upistrategy);
        upi.doPayment(6);
    }
}
