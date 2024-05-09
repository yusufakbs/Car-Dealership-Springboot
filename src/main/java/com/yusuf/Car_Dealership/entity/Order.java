package com.yusuf.Car_Dealership.entity;

import com.yusuf.Car_Dealership.entity.enums.ECarType;
import com.yusuf.Car_Dealership.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_order")
@Entity
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carCode;
    @Enumerated(EnumType.STRING)
    private ECarType carType;
    private Long addressCustomerId;
    //TODO: DTO'da bunlar verilecek.
    //private String buyersName;
    //    private String buyersSurname;
    //    private String buyersIdNumber;
    //    @Email
    //    private String buyersEmail;
    //    private String buyersPhoneNumber;
    private Double remainingAmount;
    @Builder.Default
    private Boolean isOrderCompleted = false;
    @Builder.Default
    private Boolean isPreOrderCompleted = false;
}
