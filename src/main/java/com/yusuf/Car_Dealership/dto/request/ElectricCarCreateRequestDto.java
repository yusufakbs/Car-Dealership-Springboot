package com.yusuf.Car_Dealership.dto.request;

import com.yusuf.Car_Dealership.entity.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElectricCarCreateRequestDto {

    private Long electricEngineId;
    private Double batteryCapacity;
    private Double energyConsumption;
    private EBrand brand;
    private String model;
    private EColor color;
    private Integer year;
    private Double price;
    private EBodyType bodyType;
    private EDrivetrainType drivetrainType;
    private Double weight;
    private Double topSpeed;
    private ECarType carType;

}
