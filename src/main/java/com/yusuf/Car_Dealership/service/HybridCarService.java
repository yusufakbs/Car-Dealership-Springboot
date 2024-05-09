package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.HybridCar;
import com.yusuf.Car_Dealership.mapper.HybridCarMapper;
import com.yusuf.Car_Dealership.repository.HybridCarRepository;
import com.yusuf.Car_Dealership.utility.CarCodeGenerator;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HybridCarService extends ServiceManager<HybridCar,Long> {
    private final HybridCarRepository hybridCarRepository;

    public HybridCarService(HybridCarRepository hybridCarRepository) {
        super(hybridCarRepository);
        this.hybridCarRepository = hybridCarRepository;
    }

    public List<HybridCar> createHybridCars(List<CarCreateRequestDto> dtoList) {
        List<HybridCar> hybridCarList = HybridCarMapper.INSTANCE.fromCarCreateRequestToHybridCars(dtoList);
        String batchNumber = CarCodeGenerator.generateBatchNumber();
        hybridCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
        return (List<HybridCar>) saveAll(hybridCarList);
    }

    public Optional<HybridCar> findByCarCode(String carCode){
        return hybridCarRepository.findByCarCode(carCode);
    }
}
