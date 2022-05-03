package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Orders;
import com.example.springRestApi.request.OrderRequest;
import com.example.springRestApi.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @CrossOrigin
    @GetMapping(value = "/orders")
    public ResponseEntity<List<Orders>>getAllOrders(){
        List<Orders> orders = orderService.getAllOrders();
        return ok(orders);
    }
    @CrossOrigin
    @GetMapping(value = "/order")
    public ResponseEntity<Orders> getOrderById(Long id){
        Orders orders = orderService.getOrder(id);
        return ok(orders);
    }
    @CrossOrigin
    @PostMapping(value = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Orders> postOrder(@RequestBody OrderRequest orderRequest, Long customerId){
        Orders orders = orderService.postOrder(orderRequest, customerId);
        return ok(orders);
    }
    @CrossOrigin
    @PutMapping(value = "/order")
    public ResponseEntity<Orders> updateOrder(@RequestBody OrderRequest orderRequest, Long id){
        Orders orders = orderService.updateOrder(orderRequest,id);
        return ok(orders);
    }
    @CrossOrigin
    @DeleteMapping(value = "/order")
    public void deleteOrderCustomer(Long id){
        Orders orders = orderService.deleteOrder(id);
    }


}
