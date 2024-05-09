package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
