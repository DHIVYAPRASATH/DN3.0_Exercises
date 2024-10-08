package com.adapterpattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create PayPal and Stripe gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for each gateway
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Process payments through the adapters
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
