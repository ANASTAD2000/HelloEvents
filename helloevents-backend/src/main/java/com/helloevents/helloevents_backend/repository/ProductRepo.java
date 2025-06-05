package com.helloevents.helloevents_backend.repository;

import com.helloevents.helloevents_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
