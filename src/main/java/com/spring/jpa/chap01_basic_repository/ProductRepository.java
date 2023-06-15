package com.spring.jpa.chap01_basic_repository;

import com.spring.jpa.chap01_basic_entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
