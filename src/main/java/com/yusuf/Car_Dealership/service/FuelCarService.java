package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.FuelCar;
import com.yusuf.Car_Dealership.mapper.FuelCarMapper;
import com.yusuf.Car_Dealership.repository.FuelCarRepository;
import com.yusuf.Car_Dealership.utility.CarCodeGenerator;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelCarService extends ServiceManager<FuelCar,Long> {
    private final FuelCarRepository fuelCarRepository;

    public FuelCarService(FuelCarRepository fuelCarRepository) {
        super(fuelCarRepository);
        this.fuelCarRepository = fuelCarRepository;
    }

    public List<FuelCar> createFuelCars(List<CarCreateRequestDto> dtoList) {
        List<FuelCar> fuelCarList = FuelCarMapper.INSTANCE.fromCarCreateRequestToFuelCars(dtoList);
        String batchNumber = CarCodeGenerator.generateBatchNumber();
        fuelCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
        return (List<FuelCar>) saveAll(fuelCarList);
    }

    public Optional<FuelCar> findByCarCode(String carCode){
        return fuelCarRepository.findByCarCode(carCode);
    }
}
