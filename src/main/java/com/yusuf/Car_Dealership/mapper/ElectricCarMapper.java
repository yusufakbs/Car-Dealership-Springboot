package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.dto.request.ElectricCarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.ElectricCar;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface ElectricCarMapper {

    ElectricCarMapper INSTANCE = Mappers.getMapper(ElectricCarMapper.class);
    ElectricCar fromCreateRequestToElectricCar(final ElectricCarCreateRequestDto dto);
    List<ElectricCar> fromCreateRequestToElectricCars(final List<ElectricCarCreateRequestDto> dtoList);
    List<ElectricCar> fromCarCreateRequestToElectricCars(final List<CarCreateRequestDto> dtoList);
}
