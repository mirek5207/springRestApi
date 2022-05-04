package com.example.springRestApi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pizza_Id",nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "price",nullable = false)
    private String price;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToMany(mappedBy = "pizza")
    @JsonIgnore
    private Set<Orders> orders = new HashSet<>();

}
