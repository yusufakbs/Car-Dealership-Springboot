package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Address;
import com.yusuf.Car_Dealership.repository.AddressRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends ServiceManager<Address, Long> {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        super(addressRepository);
        this.addressRepository = addressRepository;
    }

}
