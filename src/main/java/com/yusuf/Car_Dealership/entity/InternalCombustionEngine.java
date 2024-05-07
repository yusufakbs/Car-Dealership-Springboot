package com.yusuf.Car_Dealership.entity;

import com.yusuf.Car_Dealership.entity.enums.ECylinders;
import com.yusuf.Car_Dealership.entity.superclasses.Engine;
 import jakarta.persistence.*;
 import lombok.*;
 import lombok.experimental.SuperBuilder;

 @Data
 @EqualsAndHashCode(callSuper = true)
 @NoArgsConstructor
 @AllArgsConstructor
 @SuperBuilder
 @Table(name = "tbl_internal_combustion_engine")
 @Entity
 public class InternalCombustionEngine extends Engine {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(name = "engine_volume_L")
     private Double engineVolume;

     @Enumerated(EnumType.STRING)
     private ECylinders cylinders;

     @Builder.Default
     private Integer turboCount = 0;

 }