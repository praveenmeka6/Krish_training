package com.praveen.rentcloud.authorizationserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.rentcloud.authorizationserver.model.User;

public interface UserDetailsServiceRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
}
