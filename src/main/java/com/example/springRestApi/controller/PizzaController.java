package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Pizza;
import com.example.springRestApi.request.PizzaRequest;
import com.example.springRestApi.service.PizzaService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @PostMapping(value = "/pizza", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pizza> postPizza(@RequestBody PizzaRequest pizzaRequest){
        Pizza pizza = pizzaService.postPizza(pizzaRequest);
        return ResponseEntity.ok(pizza);
    }
    @GetMapping(value = "/pizza/{id}")
    public ResponseEntity<Pizza> getPizzaById(Long id){
        Pizza pizza = pizzaService.getPizza(id);
        return ResponseEntity.ok(pizza);
    }
}
