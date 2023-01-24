package com.educandoweb.projetoWebervice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebervice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
