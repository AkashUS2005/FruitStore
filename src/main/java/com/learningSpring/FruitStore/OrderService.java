package com.learningSpring.FruitStore;

public class OrderService {
    public void placeOrder() {
        // Logic to place an order for the specified fruit and quantity
        PaymentService paymnetService = new StripePaymentService();
        paymnetService.processPayment(100.0);
    }
}
