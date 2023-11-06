package com.dilevz.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilevz.couse.entities.OrderItem;
import com.dilevz.couse.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
