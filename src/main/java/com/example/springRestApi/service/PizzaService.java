package com.example.springRestApi.service;

import com.example.springRestApi.entity.Pizza;
import com.example.springRestApi.request.PizzaRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {
    Pizza postPizza(PizzaRequest pizzaRequest);

    Pizza getPizza(Long id);

    List<Pizza> getAllPizza();
}
