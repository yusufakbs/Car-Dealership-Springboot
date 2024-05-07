package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Customer;
import com.yusuf.Car_Dealership.repository.CustomerRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ServiceManager<Customer, Long> {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;

    }
}
