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
        Customer customer = new Customer(null,customerRequest.getLogin(),customerRequest.getPassword());
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
        customer.setLogin(customerRequest.getLogin());
        customer.setPassword(customerRequest.getPassword());
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
