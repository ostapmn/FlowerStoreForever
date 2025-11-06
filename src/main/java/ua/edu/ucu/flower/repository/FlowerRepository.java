package ua.edu.ucu.flower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.edu.ucu.flower.store.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer>{

}
