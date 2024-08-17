package com.di.service;

import com.di.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(String customerId) {
        return customerRepository.findCustomerById(customerId);
    }
}
