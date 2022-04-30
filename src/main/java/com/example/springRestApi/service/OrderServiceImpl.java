package com.example.springRestApi.service;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.entity.Orders;
import com.example.springRestApi.entity.Pizza;
import com.example.springRestApi.repository.CustomerRepository;
import com.example.springRestApi.repository.OrderRepository;
import com.example.springRestApi.repository.PizzaRepository;
import com.example.springRestApi.request.OrderRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final PizzaRepository pizzaRepository;


    @Override
    public Orders getOrder(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Orders postOrder(OrderRequest orderRequest, Long customerId) {
        List<Pizza> pizzaObject = new ArrayList<>();
        List<Long> pizzaIds = orderRequest.getPizzaId();
        Customer customer = customerRepository.findById(customerId).get();
        for (Long pizzaId:pizzaIds) {
            pizzaObject.add(pizzaRepository.findById(pizzaId).get());
        }
        Orders orders = Orders.builder()
                .id(null)
                .city(orderRequest.getCity())
                .customer(customer)
                .pizza(pizzaObject)
                .description(orderRequest.getDescription())
                .houseNumber(orderRequest.getHouseNumber())
                .street(orderRequest.getStreet())
                .build();
        orderRepository.save(orders);
        return orders;
    }

    @Override
    public Orders updateOrder(OrderRequest orderRequest, Long id)
    {
        return null;
    }

    @Override
    public Orders deleteOrder(Long id) {
        return null;
    }
}
