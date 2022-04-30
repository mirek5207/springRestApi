package com.example.springRestApi.service;

import com.example.springRestApi.entity.Pizza;
import com.example.springRestApi.repository.OrderRepository;
import com.example.springRestApi.repository.PizzaRepository;
import com.example.springRestApi.request.PizzaRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;

@Service
@AllArgsConstructor
public class PizzaServiceImpl implements PizzaService {
    private final PizzaRepository pizzaRepository;


    @Override
    public Pizza getPizza(Long id) {
        Pizza pizza = pizzaRepository.findById(id).get();
        return pizza;
    }

    @Override
    public Pizza postPizza(PizzaRequest pizzaRequest) {
        Pizza pizza = Pizza.builder()
                .name(pizzaRequest.getName())
                .price(pizzaRequest.getPrice())
                .build();
        pizzaRepository.save(pizza);
        return pizza;
    }


}
