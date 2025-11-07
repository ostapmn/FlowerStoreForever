

import org.junit.jupiter.api.BeforeEach;
import ua.edu.ucu.flower.store.Item;
import ua.edu.ucu.flower.store.FlowerBucket;
import ua.edu.ucu.flower.store.Flower;
import ua.edu.ucu.flower.store.FlowerPack;
import ua.edu.ucu.flower.decorator.ItemDecorator;
import ua.edu.ucu.flower.decorator.RibbonDecorator;
import ua.edu.ucu.flower.decorator.PaperDecorator;
import ua.edu.ucu.flower.decorator.BasketDecorator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorsTest {
    Flower tulip = new Flower();
    Flower rose = new Flower();
    Flower chamomile = new Flower();
    FlowerPack tulipPack = new FlowerPack(tulip, 10);
    FlowerPack rosePack = new FlowerPack(rose, 5);
    FlowerPack chamomilePack = new FlowerPack(chamomile, 7);
    FlowerBucket flowerBucket = new FlowerBucket();
    @BeforeEach
    public void setup() {
        flowerBucket.add(tulipPack);
        flowerBucket.add(rosePack);
        flowerBucket.add(chamomilePack);
    }

    @Test
    public void testRibbonDecorator(){
        Item bucket = new Item("Flower Bucket", flowerBucket);
        ItemDecorator ribbonedBucket = new RibbonDecorator(bucket);
        double expectedPrice = flowerBucket.getPrice() + 40.0;
        assertEquals(expectedPrice, ribbonedBucket.getPrice());
        String expectedDescription = "Flower Bucket, tied with a ribbon";
        assertEquals(expectedDescription, ribbonedBucket.getDescription());
    }

    @Test
    public void testPaperDecorator(){
        Item bucket = new Item("Flower Bucket", flowerBucket);
        ItemDecorator paperesBucket = new PaperDecorator(bucket);
        double expectedPrice = flowerBucket.getPrice() + 13.0;
        assertEquals(expectedPrice, paperesBucket.getPrice());
        String expectedDescription = "Flower Bucket, wrapped in paper";
        assertEquals(expectedDescription, paperesBucket.getDescription());
    }

    @Test
    public void testBasketDecorator(){
        Item bucket = new Item("Flower Bucket", flowerBucket);
        ItemDecorator basketBucket = new BasketDecorator(bucket);
        double expectedPrice = flowerBucket.getPrice() + 4.0;
        assertEquals(expectedPrice, basketBucket.getPrice());
        String expectedDescription = "Flower Bucket, placed in a basket";
        assertEquals(expectedDescription, basketBucket.getDescription());
    }
}
