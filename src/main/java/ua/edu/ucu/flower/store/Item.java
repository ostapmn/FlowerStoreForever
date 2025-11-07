package ua.edu.ucu.flower.store;

import ua.edu.ucu.flower.decorator.BasicItem;

import lombok.Data;

@Data
public class Item implements BasicItem{
    private String description;
    private FlowerBucket flowerBucket;

    public Item(String description, FlowerBucket flowerBucket) {
        this.description = description;
        this.flowerBucket = flowerBucket;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return flowerBucket.getPrice();
    }

}
