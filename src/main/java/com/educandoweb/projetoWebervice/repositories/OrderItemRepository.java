package com.educandoweb.projetoWebervice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebervice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
