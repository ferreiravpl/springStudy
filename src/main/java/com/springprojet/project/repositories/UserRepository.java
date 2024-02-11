package com.springprojet.project.repositories;

import com.springprojet.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
