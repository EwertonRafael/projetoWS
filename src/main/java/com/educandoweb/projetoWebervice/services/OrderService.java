package com.educandoweb.projetoWebervice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.projetoWebervice.entities.Order;
import com.educandoweb.projetoWebervice.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	public Order FindById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
