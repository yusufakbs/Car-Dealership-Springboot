package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.InternalCombustionEngine;
import com.yusuf.Car_Dealership.repository.InternalCombustionEngineRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InternalCombustionEngineService extends ServiceManager<InternalCombustionEngine,Long> {
    private final InternalCombustionEngineRepository internalCombustionEngineRepository;

    public InternalCombustionEngineService(InternalCombustionEngineRepository internalCombustionEngineRepository) {
        super(internalCombustionEngineRepository);
        this.internalCombustionEngineRepository = internalCombustionEngineRepository;
    }
}
