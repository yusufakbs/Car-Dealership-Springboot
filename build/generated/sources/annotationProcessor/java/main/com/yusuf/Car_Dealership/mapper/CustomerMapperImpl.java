package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-08T23:48:32+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer fromOrderRequestToCustomer(OrderRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Customer.CustomerBuilder<?, ?> customer = Customer.builder();

        customer.customerName( dto.getCustomerName() );
        customer.customerSurname( dto.getCustomerSurname() );
        customer.customerIdNumber( dto.getCustomerIdNumber() );
        customer.customerEmail( dto.getCustomerEmail() );
        customer.customerPhoneNumber( dto.getCustomerPhoneNumber() );

        return customer.build();
    }
}
