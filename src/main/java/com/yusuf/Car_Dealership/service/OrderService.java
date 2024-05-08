package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.dto.request.OrderRequestDto;
import com.yusuf.Car_Dealership.entity.Address;
import com.yusuf.Car_Dealership.entity.Address_Customer;
import com.yusuf.Car_Dealership.entity.Customer;
import com.yusuf.Car_Dealership.entity.Order;
import com.yusuf.Car_Dealership.mapper.AddressMapper;
import com.yusuf.Car_Dealership.mapper.CustomerMapper;
import com.yusuf.Car_Dealership.mapper.OrderMapper;
import com.yusuf.Car_Dealership.repository.OrderRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final AddressService addressService;
    private final Address_CustomerService address_customerService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, AddressService addressService, Address_CustomerService address_customerService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.addressService = addressService;
        this.address_customerService = address_customerService;

    }

    public Order newOrder(OrderRequestDto dto){
        Address address = AddressMapper.INSTANCE.fromOrderRequestToAddress(dto);
        Customer customer = CustomerMapper.INSTANCE.fromOrderRequestToCustomer(dto);
        customerService.save(customer);
        address.setCountryId(1L);
        addressService.save(address); //TODO Address,countryId düzenlenecek.
        address_customerService.save(Address_Customer.builder()
                .addressId(address.getId()).customerId(customer.getId()).build());
        Order order = OrderMapper.INSTANCE.fromOrderRequestToOrder(dto);
        order.setCustomerId(customer.getId());
        order.setAddressId(customer.getId());
        return save(order);
    }
}
