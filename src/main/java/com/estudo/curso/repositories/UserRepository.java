package com.estudo.curso.repositories;

import com.estudo.curso.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
