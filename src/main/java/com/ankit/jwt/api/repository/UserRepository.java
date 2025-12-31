package com.ankit.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankit.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  User findByUserName(String username);
}
