package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.ElectricCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ElectricCarRepository extends JpaRepository<ElectricCar,Long> {
    Optional<ElectricCar> findByCarCode(String carCode);
}
