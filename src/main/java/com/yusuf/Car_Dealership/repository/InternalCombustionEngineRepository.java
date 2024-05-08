package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.InternalCombustionEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalCombustionEngineRepository extends JpaRepository<InternalCombustionEngine,Long> {
}
