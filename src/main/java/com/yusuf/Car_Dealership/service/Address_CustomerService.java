package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Address_Customer;
import com.yusuf.Car_Dealership.repository.Address_CustomerRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Address_CustomerService extends ServiceManager<Address_Customer,Long> {
    private final Address_CustomerRepository addressCustomerRepository;

    public Address_CustomerService(Address_CustomerRepository addressCustomerRepository) {
        super(addressCustomerRepository);
        this.addressCustomerRepository = addressCustomerRepository;
    }

    public Optional<Address_Customer> findByAddressIdAndCustomerId(Long addressId, Long customerId){
        return addressCustomerRepository.findByAddressIdAndCustomerId(addressId,customerId);
    }

    public Boolean doesAddressCustomerExists(Address_Customer addressCustomer){
        return addressCustomerRepository.existsByAddressIdAndCustomerId(addressCustomer.getAddressId(),addressCustomer.getCustomerId());
    }
}
