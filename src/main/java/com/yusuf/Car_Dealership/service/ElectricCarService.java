package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.dto.request.ElectricCarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.ElectricCar;
import com.yusuf.Car_Dealership.mapper.ElectricCarMapper;
import com.yusuf.Car_Dealership.repository.ElectricCarRepository;
import com.yusuf.Car_Dealership.utility.CarCodeGenerator;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricCarService extends ServiceManager<ElectricCar,Long> {
    private final ElectricCarRepository electricCarRepository;

    public ElectricCarService(ElectricCarRepository electricCarRepository) {
        super(electricCarRepository);
        this.electricCarRepository = electricCarRepository;
    }

    public ElectricCar createElectricCar(ElectricCarCreateRequestDto dto){
        ElectricCar electricCar = ElectricCarMapper.INSTANCE.fromCreateRequestToElectricCar(dto);
        electricCar.setCarCode(CarCodeGenerator.generateCarCode(CarCodeGenerator.generateBatchNumber(),electricCar));
        return save(electricCar);
    }

    //    public List<ElectricCar> createElectricCars(List<ElectricCarCreateRequestDto> dtoList) {
    //        List<ElectricCar> electricCarList = ElectricCarMapper.INSTANCE.fromCreateRequestToElectricCars(dtoList);
    //        String batchNumber = CarCodeGenerator.generateBatchNumber();
    //
    //        electricCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
    //        return (List<ElectricCar>) saveAll(electricCarList);
    //    }

    public List<ElectricCar> createElectricCars(List<CarCreateRequestDto> dtoList) {
        List<ElectricCar> electricCarList = ElectricCarMapper.INSTANCE.fromCarCreateRequestToElectricCars(dtoList);
        String batchNumber = CarCodeGenerator.generateBatchNumber();
        electricCarList.forEach(car -> car.setCarCode(CarCodeGenerator.generateCarCode(batchNumber,car)));
        return (List<ElectricCar>) saveAll(electricCarList);
    }

    public Optional<ElectricCar> findByCarCode(String carCode){
        return electricCarRepository.findByCarCode(carCode);
    }
}
