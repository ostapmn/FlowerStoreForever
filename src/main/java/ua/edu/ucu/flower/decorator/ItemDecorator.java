package ua.edu.ucu.flower.decorator;

public abstract class ItemDecorator implements BasicItem {
    private BasicItem wrapped;

    public ItemDecorator(BasicItem item) {
        this.wrapped = item;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice();
    }

}
