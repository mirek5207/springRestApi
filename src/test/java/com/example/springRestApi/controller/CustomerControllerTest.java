package com.example.springRestApi.controller;

import com.example.springRestApi.entity.Customer;
import com.example.springRestApi.request.CustomerRequest;
import com.example.springRestApi.service.CustomerService;
import com.example.springRestApi.service.OrderService;
import com.example.springRestApi.service.PizzaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerService customerService;
    @MockBean
    private OrderService orderService;
    @MockBean
    private PizzaService pizzaService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldReturnSuccessStatusResponseWhenGetCustomerById() throws Exception {
        mockMvc.perform(get("/customer?id=1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void postCustomer() throws Exception {
        Customer customer = Customer.builder()
                .name("name")
                .surname("surname")
                .build();
        Mockito.when(customerService.createCustomer(Mockito.any(CustomerRequest.class))).thenReturn(customer);
        mockMvc.perform(post("/postCustomer")
                        .content(asJsonString(customer))
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is(500));
    }
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void updateDataCustomer() {
    }

    @Test
    void deleteDataCustomer() {
    }
}