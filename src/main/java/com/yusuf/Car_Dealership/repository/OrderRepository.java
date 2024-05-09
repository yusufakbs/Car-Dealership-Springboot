package com.yusuf.Car_Dealership.repository;

import com.yusuf.Car_Dealership.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
