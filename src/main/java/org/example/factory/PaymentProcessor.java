package org.example.factory;

public class PaymentProcessor {
    public void paymentProcess(String payemntMode, double amount){

        if( payemntMode.equals("UPI")){
            processUPIPayment(amount);
        }else if( payemntMode.equals("CreditCard")){
            processCreditCardPayment(amount);
        }else if( payemntMode.equals("DebitCard")){
                processDebitCardPayment(amount);
        }else{
            System.out.println("Invalid payment mode. Please select UPI, CREDIT_CARD, or DEBIT.");
        }
    }
    private void processUPIPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
    private void processCreditCardPayment(double amount) {
        System.out.println("Processing Credit Card payment of amount: " + amount);
    }
    private void processDebitCardPayment(double amount) {
        System.out.println("Processing Debit Card payment of amount: " + amount);
    }
    //main method is our client
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Example usage
        paymentProcessor.paymentProcess("UPI", 500.0);
        paymentProcessor.paymentProcess("CreditCard", 1000.0);
        paymentProcessor.paymentProcess("DebitCard", 750.0);
        paymentProcessor.paymentProcess("Cash", 300.0); // Invalid type
    }
}
