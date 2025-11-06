package ua.edu.ucu.flower.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.flower.services.FlowerService;
import ua.edu.ucu.flower.store.Flower;
import java.util.List;



@RestController
public class FlowerController {

    private final FlowerService flowerService;
    @Autowired
    private FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerService.getFlower();
    }

    @PostMapping("/flowers")
    public Flower createFlower(@RequestBody Flower flower){
        return flowerService.createFlower(flower);
    }
}
