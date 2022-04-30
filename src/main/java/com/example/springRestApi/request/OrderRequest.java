package com.example.springRestApi.request;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.entity.Pizza;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Set;

@Jacksonized
@Value
public class OrderRequest {
    private String description;
    private String city;
    private String street;
    private String houseNumber;
}
