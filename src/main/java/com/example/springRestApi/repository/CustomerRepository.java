package com.example.springRestApi.repository;

import com.example.springRestApi.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
