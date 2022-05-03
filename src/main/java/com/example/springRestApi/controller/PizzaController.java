package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Pizza;
import com.example.springRestApi.request.PizzaRequest;
import com.example.springRestApi.service.PizzaService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;
    @CrossOrigin
    @PostMapping(value = "/pizza", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pizza> postPizza(@RequestBody PizzaRequest pizzaRequest){
        Pizza pizza = pizzaService.postPizza(pizzaRequest);
        return ok(pizza);
    }
    @CrossOrigin
    @GetMapping(value = "/pizza")
    public ResponseEntity<Pizza> getPizzaById(Long id){
        Pizza pizza = pizzaService.getPizza(id);
        return ok(pizza);
    }
}
