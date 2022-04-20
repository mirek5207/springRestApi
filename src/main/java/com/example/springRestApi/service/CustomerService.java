package com.example.springRestApi.service;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.request.CustomerRequest;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public Customer createCustomer(CustomerRequest customerRequest);
    public Customer getCustomer(Long id);
    public Customer updateCustomer(CustomerRequest customerRequest, Long id);
    public void deleteCustomer(Long id);

}
