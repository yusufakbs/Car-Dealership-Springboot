package com.yusuf.Car_Dealership.controller;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.superclasses.Car;
import com.yusuf.Car_Dealership.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @PostMapping("/create")
    public ResponseEntity<List<Car>> createCars(@RequestBody @Valid List<CarCreateRequestDto> dto){
        return ResponseEntity.ok(carService.createCars(dto));
    }
}
