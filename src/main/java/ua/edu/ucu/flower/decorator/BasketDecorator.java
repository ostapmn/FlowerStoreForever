package ua.edu.ucu.flower.decorator;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(BasicItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", placed in a basket";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4.0;
    }
}
