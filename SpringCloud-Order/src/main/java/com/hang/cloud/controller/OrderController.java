package com.hang.cloud.controller;

import com.hang.cloud.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceImpl orderServiceImpl;

    @GetMapping("order/{id}")
    public String queryOrderById(@PathVariable Long id) {
        return orderServiceImpl.queryOrderById(id);
    }

}
