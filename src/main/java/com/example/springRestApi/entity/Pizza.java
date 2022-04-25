package com.example.springRestApi.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pizzaId",nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "city",nullable = false)
    private String price;

    @ManyToMany(mappedBy = "pizza")
    private Set<Order> orders = new HashSet<>();

}
