package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {

}
