package com.yusuf.Car_Dealership.service;


import com.yusuf.Car_Dealership.entity.HybridEngine;
import com.yusuf.Car_Dealership.repository.HybridEngineRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HybridEngineService extends ServiceManager<HybridEngine,Long> {
    private final HybridEngineRepository hybridEngineRepository;

    public HybridEngineService(HybridEngineRepository hybridEngineRepository) {
        super(hybridEngineRepository);
        this.hybridEngineRepository = hybridEngineRepository;

    }
}
