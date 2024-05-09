package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Country;
import com.yusuf.Car_Dealership.entity.PaymentInfo;
import com.yusuf.Car_Dealership.repository.PaymentInfoRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoService extends ServiceManager<PaymentInfo,Long> {
    private final PaymentInfoRepository paymentInfoRepository;


    public PaymentInfoService(PaymentInfoRepository paymentInfoRepository) {
        super(paymentInfoRepository);
        this.paymentInfoRepository = paymentInfoRepository;
    }


}
