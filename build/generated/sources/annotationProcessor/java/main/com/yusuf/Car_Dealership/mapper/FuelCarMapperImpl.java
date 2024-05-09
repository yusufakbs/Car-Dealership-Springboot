package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.CarCreateRequestDto;
import com.yusuf.Car_Dealership.entity.FuelCar;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-10T00:04:22+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class FuelCarMapperImpl implements FuelCarMapper {

    @Override
    public List<FuelCar> fromCarCreateRequestToFuelCars(List<CarCreateRequestDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<FuelCar> list = new ArrayList<FuelCar>( dtoList.size() );
        for ( CarCreateRequestDto carCreateRequestDto : dtoList ) {
            list.add( carCreateRequestDtoToFuelCar( carCreateRequestDto ) );
        }

        return list;
    }

    protected FuelCar carCreateRequestDtoToFuelCar(CarCreateRequestDto carCreateRequestDto) {
        if ( carCreateRequestDto == null ) {
            return null;
        }

        FuelCar.FuelCarBuilder<?, ?> fuelCar = FuelCar.builder();

        fuelCar.brand( carCreateRequestDto.getBrand() );
        fuelCar.model( carCreateRequestDto.getModel() );
        fuelCar.color( carCreateRequestDto.getColor() );
        fuelCar.year( carCreateRequestDto.getYear() );
        fuelCar.price( carCreateRequestDto.getPrice() );
        fuelCar.bodyType( carCreateRequestDto.getBodyType() );
        fuelCar.drivetrainType( carCreateRequestDto.getDrivetrainType() );
        fuelCar.weight( carCreateRequestDto.getWeight() );
        fuelCar.topSpeed( carCreateRequestDto.getTopSpeed() );
        fuelCar.internalCombustionEngineId( carCreateRequestDto.getInternalCombustionEngineId() );
        fuelCar.fuelCapacity( carCreateRequestDto.getFuelCapacity() );
        fuelCar.fuelConsumption( carCreateRequestDto.getFuelConsumption() );

        return fuelCar.build();
    }
}
