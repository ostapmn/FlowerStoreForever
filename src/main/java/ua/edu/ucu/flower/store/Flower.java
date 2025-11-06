package ua.edu.ucu.flower.store;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "flowers")
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "flowertype")
    private String flowerType;
    @Column(name = "flowercolor")
    private String flowerColor;
    @Column(name = "price")
    private double  price;
    @Column(name = "sepal_length")
    private double sepalLength;
}