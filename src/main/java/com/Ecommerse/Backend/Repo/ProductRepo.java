package com.Ecommerse.Backend.Repo;

import com.Ecommerse.Backend.Models.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductDetails, Integer> {

}
