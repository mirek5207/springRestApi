package com.example.springRestApi.service;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.repository.CustomerRepository;
import com.example.springRestApi.request.CustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;


    @Override
    public Customer createCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .id(null)
                .name(customerRequest.getName())
                .surname(customerRequest.getSurname())
                .phoneNumber(customerRequest.getPhoneNumber())
                .build();
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(CustomerRequest customerRequest, Long id) {
        Customer customer = customerRepository.findById(id).get();
        customer.setName(customerRequest.getName());
        customer.setSurname(customerRequest.getSurname());
        customer.setPhoneNumber(customerRequest.getPhoneNumber());
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
