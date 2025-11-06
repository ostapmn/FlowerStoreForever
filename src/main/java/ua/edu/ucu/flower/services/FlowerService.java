package ua.edu.ucu.flower.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.edu.ucu.flower.store.Flower;
import ua.edu.ucu.flower.repository.FlowerRepository;

@Service
public class FlowerService {
    
    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlower(){
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower flower){
        return flowerRepository.save(flower);
    }
  
}
