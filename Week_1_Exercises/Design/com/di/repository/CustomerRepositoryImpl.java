package com.di.repository;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
        // Simulate finding a customer in a database
        return "Customer " + customerId + ": John Doe";
    }
}
