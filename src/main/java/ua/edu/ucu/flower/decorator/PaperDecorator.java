package ua.edu.ucu.flower.decorator;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(BasicItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", wrapped in paper";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 13.0;
    }
}