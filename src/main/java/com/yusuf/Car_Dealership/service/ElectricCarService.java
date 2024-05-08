package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.ElectricCar;
import com.yusuf.Car_Dealership.repository.ElectricCarRepository;
import com.yusuf.Car_Dealership.repository.ElectricEngineRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ElectricCarService extends ServiceManager<ElectricCar,Long> {
    private final ElectricCarRepository electricCarRepository;

    public ElectricCarService(ElectricCarRepository electricCarRepository) {
        super(electricCarRepository);
        this.electricCarRepository = electricCarRepository;
    }
}
