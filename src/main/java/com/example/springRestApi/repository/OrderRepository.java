package com.example.springRestApi.repository;

import com.example.springRestApi.entity.Orders;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Orders,Long> {
}
