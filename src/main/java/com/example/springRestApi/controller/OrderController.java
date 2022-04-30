package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Orders;
import com.example.springRestApi.request.OrderRequest;
import com.example.springRestApi.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping(value = "/order/{id}")
    public ResponseEntity<Orders> getOrderById(Long id){
        Orders orders = orderService.getOrder(id);
        return ok(orders);
    }

    @PostMapping(value = "/order/{customerId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Orders> postOrder(@RequestBody OrderRequest orderRequest, Long customerId, Set<Long> pizzaId){
        Orders orders = orderService.postOrder(orderRequest, customerId, pizzaId);
        return ok(orders);
    }
    @PutMapping(value = "/order/{id}")
    public ResponseEntity<Orders> updateOrder(@RequestBody OrderRequest orderRequest, Long id){
        Orders orders = orderService.updateOrder(orderRequest,id);
        return ok(orders);
    }
    @DeleteMapping(value = "/order/{id}")
    public void deleteOrderCustomer(Long id){
        Orders orders = orderService.deleteOrder(id);
    }


}
