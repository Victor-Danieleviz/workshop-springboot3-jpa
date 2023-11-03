package com.dilevz.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilevz.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
