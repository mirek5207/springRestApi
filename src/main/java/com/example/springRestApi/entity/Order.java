package com.example.springRestApi.entity;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId",nullable = false)
    private Long id;

    @Column(name = "description",nullable = true)
    private String description;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "street",nullable = false)
    private String street;

    @Column(name = "houseNumber",nullable = false)
    private String houseNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "order_pizza",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "pizzaId")
    )
    private Set<Pizza> pizza = new HashSet<>();
}
