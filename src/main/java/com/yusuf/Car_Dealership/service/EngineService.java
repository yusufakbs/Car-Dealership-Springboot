package com.yusuf.Car_Dealership.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EngineService  {

    private final ElectricEngineService electricEngineService;
    private final InternalCombustionEngineService internalCombustionEngineService;
    private final HybridEngineService hybridEngineService;

}
