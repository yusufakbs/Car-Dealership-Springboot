package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.PaymentInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-10T00:23:15+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Eclipse Adoptium)"
)
@Component
public class PaymentInfoMapperImpl implements PaymentInfoMapper {

    @Override
    public PaymentInfo fromOrderRequestToPaymentInfo(OrderRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        PaymentInfo.PaymentInfoBuilder<?, ?> paymentInfo = PaymentInfo.builder();

        paymentInfo.paymentAmount( dto.getPaymentAmount() );

        return paymentInfo.build();
    }
}
