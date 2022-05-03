package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.request.CustomerRequest;
import com.example.springRestApi.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @CrossOrigin
    @GetMapping(value = "/customer")
    public ResponseEntity<Customer> getCustomerById(Long id){
        Customer customer = customerService.getCustomer(id);
        return ok(customer);
    }
    @CrossOrigin
    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> postCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = customerService.createCustomer(customerRequest);
        return ok(customer);
    }
    @CrossOrigin
    @PutMapping(value = "/customer")
    public ResponseEntity<Customer> updateDataCustomer(CustomerRequest customerRequest , Long id){
        Customer customer = customerService.updateCustomer(customerRequest, id);
        return ok(customer);
    }
    @CrossOrigin
    @DeleteMapping(value = "/customer")
    public void deleteDataCustomer(Long id){
        customerService.deleteCustomer(id);
    }
}
