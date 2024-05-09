package com.yusuf.Car_Dealership.entity;

import com.yusuf.Car_Dealership.entity.superclasses.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "tbl_address_customer")
@Entity
public class Address_Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long addressId;
    @Column(nullable = false)
    private Long customerId;
}
