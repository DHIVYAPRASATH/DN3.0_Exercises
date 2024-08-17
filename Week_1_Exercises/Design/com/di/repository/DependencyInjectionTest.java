package com.di.main;

import com.di.repository.CustomerRepository;
import com.di.repository.CustomerRepositoryImpl;
import com.di.service.CustomerService;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to get customer details
        String customerDetails = customerService.getCustomerDetails("123");
        System.out.println(customerDetails);
    }
}
