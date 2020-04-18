package com.hang.cloud.controller;

import com.hang.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiGatewayController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    String queryOrderById(@PathVariable Long id) {
        return orderService.queryOrderById(id);
    }

}
