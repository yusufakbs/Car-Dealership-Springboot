package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.HybridCar;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-08T23:54:21+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class HybridCarMapperImpl implements HybridCarMapper {

    @Override
    public List<HybridCar> fromCarCreateRequestToHybridCars(List<CarCreateRequestDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<HybridCar> list = new ArrayList<HybridCar>( dtoList.size() );
        for ( CarCreateRequestDto carCreateRequestDto : dtoList ) {
            list.add( carCreateRequestDtoToHybridCar( carCreateRequestDto ) );
        }

        return list;
    }

    protected HybridCar carCreateRequestDtoToHybridCar(CarCreateRequestDto carCreateRequestDto) {
        if ( carCreateRequestDto == null ) {
            return null;
        }

        HybridCar.HybridCarBuilder<?, ?> hybridCar = HybridCar.builder();

        hybridCar.brand( carCreateRequestDto.getBrand() );
        hybridCar.model( carCreateRequestDto.getModel() );
        hybridCar.color( carCreateRequestDto.getColor() );
        hybridCar.year( carCreateRequestDto.getYear() );
        hybridCar.price( carCreateRequestDto.getPrice() );
        hybridCar.bodyType( carCreateRequestDto.getBodyType() );
        hybridCar.drivetrainType( carCreateRequestDto.getDrivetrainType() );
        hybridCar.weight( carCreateRequestDto.getWeight() );
        hybridCar.topSpeed( carCreateRequestDto.getTopSpeed() );
        hybridCar.electricEngineId( carCreateRequestDto.getElectricEngineId() );
        hybridCar.internalCombustionEngineId( carCreateRequestDto.getInternalCombustionEngineId() );
        hybridCar.batteryCapacity( carCreateRequestDto.getBatteryCapacity() );
        hybridCar.energyConsumption( carCreateRequestDto.getEnergyConsumption() );
        hybridCar.singleEngineEnergyConsumption( carCreateRequestDto.getSingleEngineEnergyConsumption() );
        hybridCar.fuelCapacity( carCreateRequestDto.getFuelCapacity() );
        hybridCar.fuelConsumption( carCreateRequestDto.getFuelConsumption() );
        hybridCar.singleEngineFuelConsumption( carCreateRequestDto.getSingleEngineFuelConsumption() );

        return hybridCar.build();
    }
}
