package com.educandoweb.projetoWebervice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebervice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
