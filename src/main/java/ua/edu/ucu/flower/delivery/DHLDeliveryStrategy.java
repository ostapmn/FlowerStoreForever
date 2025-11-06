package ua.edu.ucu.flower.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double delivery(double orderPrice) {
        System.out.println("DHL delivery: ");
        if (orderPrice > 2000) {
            return 0;
        }
        return 200;
    }
}
