package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.HybridCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HybridCarRepository extends JpaRepository<HybridCar,Long> {
    Optional<HybridCar> findByCarCode(String carCode);
}
