package com.example.springRestApi.service;

import com.example.springRestApi.entity.Orders;
import com.example.springRestApi.request.OrderRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface OrderService {

    Orders getOrder(Long id);

    Orders postOrder(OrderRequest orderRequest, Long customerId);

    Orders updateOrder(OrderRequest orderRequest, Long id);

    Orders deleteOrder(Long id);
}
