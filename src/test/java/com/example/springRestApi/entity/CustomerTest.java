package com.example.springRestApi.entity;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer();
    }

    @Test
    void getId() {
        //given
        Long id = 4L;
        //when
        customer.setId(id);
        //then
        assertEquals(id,customer.getId());
    }

    @Test
    void getLogin() {
        //given
        String login = "login";
        //when
        customer.setLogin(login);
        //then
        assertEquals(login,customer.getLogin());
    }

    @Test
    void getPassword() {
        //given
        String password = "password";
        //when
        customer.setPassword(password);
        //then
        assertEquals(password,customer.getPassword());
    }

}