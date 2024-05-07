package com.yusuf.Car_Dealership.controller;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Order;
import com.yusuf.Car_Dealership.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> newOrder(@RequestBody @Valid OrderRequestDto dto){
        return ResponseEntity.ok(orderService.newOrder(dto));
    }
}
