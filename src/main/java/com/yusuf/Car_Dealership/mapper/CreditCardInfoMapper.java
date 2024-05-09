package com.yusuf.Car_Dealership.mapper;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Address;
import com.yusuf.Car_Dealership.entity.CreditCardInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CreditCardInfoMapper {
    CreditCardInfoMapper INSTANCE = Mappers.getMapper(CreditCardInfoMapper.class);
    CreditCardInfo fromOrderRequestToCreditCardInfo(final OrderRequestDto dto);
}
