package com.dilevz.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilevz.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
