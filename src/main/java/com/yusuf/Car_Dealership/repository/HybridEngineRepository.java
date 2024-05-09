package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.HybridEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HybridEngineRepository extends JpaRepository<HybridEngine,Long> {
}
