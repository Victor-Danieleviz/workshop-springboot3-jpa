package com.dilevz.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilevz.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
