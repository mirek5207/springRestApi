package com.example.springRestApi.repository;

import com.example.springRestApi.entity.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OrderRepository extends CrudRepository<Orders,Long> {
    List<Orders>findAll();
}
