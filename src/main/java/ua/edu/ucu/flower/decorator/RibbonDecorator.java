package ua.edu.ucu.flower.decorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(BasicItem item){
        super(item);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", tied with a ribbon";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 40.0;
    }

}
