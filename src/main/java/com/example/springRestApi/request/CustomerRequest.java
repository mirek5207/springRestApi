package com.example.springRestApi.request;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Value
public class CustomerRequest {
    private String name;
    private String surname;
    private String phoneNumber;
}
