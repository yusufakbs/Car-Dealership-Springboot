package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Country;
import com.yusuf.Car_Dealership.repository.CountryRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends ServiceManager<Country,Long> {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        super(countryRepository);
        this.countryRepository = countryRepository;

    }
}
