package com.example.springRestApi.request;

import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Value
public class PizzaRequest {
    private String name;
    private String price;
}
