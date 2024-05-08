package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Address_Customer;
import com.yusuf.Car_Dealership.repository.Address_CustomerRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class Address_CustomerService extends ServiceManager<Address_Customer,Long> {
    private final Address_CustomerRepository addressCustomerRepository;

    public Address_CustomerService(Address_CustomerRepository addressCustomerRepository) {
        super(addressCustomerRepository);
        this.addressCustomerRepository = addressCustomerRepository;
    }
}
