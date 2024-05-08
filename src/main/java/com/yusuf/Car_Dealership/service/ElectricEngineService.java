package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.ElectricEngine;
import com.yusuf.Car_Dealership.repository.ElectricEngineRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ElectricEngineService extends ServiceManager<ElectricEngine,Long> {
    private final ElectricEngineRepository electricEngineRepository;

    public ElectricEngineService(ElectricEngineRepository electricEngineRepository) {
        super(electricEngineRepository);
        this.electricEngineRepository = electricEngineRepository;
    }
}
