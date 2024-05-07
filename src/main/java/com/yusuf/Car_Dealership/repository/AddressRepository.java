package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
