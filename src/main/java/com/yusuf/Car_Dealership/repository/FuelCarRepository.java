package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.FuelCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelCarRepository extends JpaRepository<FuelCar,Long> {
}
