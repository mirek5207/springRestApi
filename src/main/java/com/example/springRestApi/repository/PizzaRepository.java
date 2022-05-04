package com.example.springRestApi.repository;

import com.example.springRestApi.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaRepository extends CrudRepository<Pizza,Long> {
    List<Pizza> findAll();
}
