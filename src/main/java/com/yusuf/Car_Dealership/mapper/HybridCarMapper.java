package com.yusuf.Car_Dealership.mapper;


import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.HybridCar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HybridCarMapper {

    HybridCarMapper INSTANCE = Mappers.getMapper(HybridCarMapper.class);

    List<HybridCar> fromCarCreateRequestToHybridCars(final List<CarCreateRequestDto> dtoList);
}