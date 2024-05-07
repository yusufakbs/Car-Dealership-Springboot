package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
