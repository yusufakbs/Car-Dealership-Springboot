package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.FuelCar;
import com.yusuf.Car_Dealership.repository.FuelCarRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FuelCarService extends ServiceManager<FuelCar,Long> {
    private final FuelCarRepository fuelCarRepository;

    public FuelCarService(FuelCarRepository fuelCarRepository) {
        super(fuelCarRepository);
        this.fuelCarRepository = fuelCarRepository;
    }
}
