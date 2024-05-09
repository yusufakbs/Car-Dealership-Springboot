package com.yusuf.Car_Dealership.service;

import com.yusuf.Car_Dealership.entity.Customer;
import com.yusuf.Car_Dealership.repository.CustomerRepository;
import com.yusuf.Car_Dealership.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService extends ServiceManager<Customer, Long> {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findByCustomerCitizenshipId(String customerCitizenshipId){
        return customerRepository.findOptionalByCustomerCitizenshipId(customerCitizenshipId);
    }

    public Boolean doesCustomerExist(Customer customer) {
        return customerRepository.existsByCustomerNameAndCustomerSurnameAndCustomerCitizenshipIdAndCustomersEmailAndCustomersPhoneNumber(
                customer.getCustomerName(), customer.getCustomerSurname(), customer.getCustomerCitizenshipId(),
                customer.getCustomersEmail(), customer.getCustomersPhoneNumber());
    }
}
