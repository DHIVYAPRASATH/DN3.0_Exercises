package com.strategypattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");

        // Create a payment context and set strategy
        PaymentContext paymentContext = new PaymentContext(creditCard);
        paymentContext.executePayment(150.00);

        // Change strategy to PayPal
        paymentContext.setPaymentStrategy(payPal);
        paymentContext.executePayment(200.00);
    }
}
