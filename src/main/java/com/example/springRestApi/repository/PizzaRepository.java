package com.example.springRestApi.repository;

import com.example.springRestApi.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza,Long> {
}
