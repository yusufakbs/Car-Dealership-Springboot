package com.yusuf.Car_Dealership.dto.request;

import com.yusuf.Car_Dealership.entity.enums.ECarType;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {
    private String carCode;
    private ECarType carType;
    //Customer Info
    private String customerName;
    private String customerSurname;
    private String customerIdNumber;
    @Email
    private String customerEmail;
    private String customerPhoneNumber;
    //Payment Info
    private Double transactedAmount;
    //Address Info
    private String street;
    private String city;
    private String apartmentNo;
    private String postalCode;
    private String country;
}
