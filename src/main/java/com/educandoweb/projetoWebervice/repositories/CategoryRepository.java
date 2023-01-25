package com.educandoweb.projetoWebervice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebervice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
