package com.yusuf.Car_Dealership.dto.request;

import com.yusuf.Car_Dealership.entity.enums.ECarType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    private String customerCitizenshipId;
    @Email
    private String customersEmail;
    private String customersPhoneNumber;

    //Payment Info
    @NotBlank
    private String ownersName;
    @NotBlank
    private String ownersSurname;
    @Size(min = 16, max = 16)
    private String creditCardNo;
    @Size(min = 5, max = 5)
    private String creditCardExpirationDate; //TODO Date formatter ile değiştirilebilir.
    @Size(min = 3, max = 3)
    private String cvc;
    private Double paymentAmount;

    //Address Info
    private String street;
    private String city;
    private String apartmentNo;
    private String postalCode;
    private Long countryId;
}
