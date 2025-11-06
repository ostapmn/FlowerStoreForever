package ua.edu.ucu.flower.payment;

public class CreditCardPaymentStrategy implements Payment {
    static final double COMMISSION = 0.005;
    @Override
    public double pay(double amount) {
        double finalAmount = amount * (1 + COMMISSION);
        System.out.println("Paid " + finalAmount + " using Credit Card.");
        return finalAmount;
    }
    
}