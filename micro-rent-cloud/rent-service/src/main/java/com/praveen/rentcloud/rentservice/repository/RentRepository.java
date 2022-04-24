package com.praveen.rentcloud.rentservice.repository;

import com.praveen.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}
