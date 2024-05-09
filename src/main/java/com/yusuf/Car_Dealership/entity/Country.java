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
@Table(name = "tbl_country")
@Entity
public class Country extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String isoCode;

    @Column(nullable = false)
    private String capital;

    @Column(nullable = false)
    private String continent;

    @Column(nullable = false)
    private String region;
}
