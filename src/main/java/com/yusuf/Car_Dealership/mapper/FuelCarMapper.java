package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.FuelCar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FuelCarMapper {
    FuelCarMapper INSTANCE = Mappers.getMapper(FuelCarMapper.class);
    List<FuelCar> fromCarCreateRequestToFuelCars(final List<CarCreateRequestDto> dtoList);
}
