package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Address;
import com.yusuf.Car_Dealership.entity.Address_Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address_CustomerRepository extends JpaRepository<Address_Customer,Long> {
}
