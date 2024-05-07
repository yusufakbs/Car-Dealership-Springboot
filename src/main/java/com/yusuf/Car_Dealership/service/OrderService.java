package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Address;
import com.yusuf.Car_Dealership.entity.Customer;
import com.yusuf.Car_Dealership.entity.Order;
import com.yusuf.Car_Dealership.repository.OrderRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final AddressService addressService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, AddressService addressService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.addressService = addressService;

    }

    public Order newOrder(OrderRequestDto dto){
        Address address = Address.builder()
                .street(dto.getStreet())
                .city(dto.getCity())
                .apartmentNo(dto.getApartmentNo())
                .postalCode(dto.getPostalCode())
                .country(dto.getCountry())
                .build();
        Customer customer = Customer.builder()
                .buyersName(dto.getBuyersName())
                .buyersSurname(dto.getBuyersSurname())
                .countryId(1L)
                .buyersIdNumber(dto.getBuyersIdNumber())
                .buyersEmail(dto.getBuyersEmail())
                .buyersPhoneNumber(dto.getBuyersPhoneNumber())
                .build();
        customerService.save(customer);
        addressService.save(address);
        Order order = Order.builder()
                .carType(dto.getCarType())
                .carCode(dto.getCarCode())
                .customerId(customer.getId())
                .addressId(address.getId())
                .transactedAmount(1230948.1)
                .build();
        return save(order);
    }
}
