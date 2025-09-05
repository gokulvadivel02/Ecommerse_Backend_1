package com.Ecommerse.Backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;
    private String productName ;
    private String description ;
    private boolean stock ;
    private int price ;
    private String category ;
    private String brand ;
    private String imageUrl ;
}
