package com.yusuf.Car_Dealership.entity;

import com.yusuf.Car_Dealership.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_payment_info")
public class PaymentInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long creditCardId;
    private Long orderId;
    private Double paymentAmount;

}
