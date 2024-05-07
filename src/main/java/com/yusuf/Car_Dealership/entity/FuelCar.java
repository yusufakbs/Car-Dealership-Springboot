package com.yusuf.Car_Dealership.entity;

import com.yusuf.Car_Dealership.entity.superclasses.Car;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_fuel_car")
@Entity
public class FuelCar extends Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long internalCombustionEngineId;
    @Column(name = "fuel_capacity_L")
    private Double fuelCapacity;
    @Column(name = "fuel_consumption_L/km")
    private Double fuelConsumption;
}
