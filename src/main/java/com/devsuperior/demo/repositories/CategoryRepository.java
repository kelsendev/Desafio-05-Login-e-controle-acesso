package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
