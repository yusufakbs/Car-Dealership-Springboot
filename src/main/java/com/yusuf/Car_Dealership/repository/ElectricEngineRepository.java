package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.ElectricEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricEngineRepository extends JpaRepository<ElectricEngine,Long> {
}
