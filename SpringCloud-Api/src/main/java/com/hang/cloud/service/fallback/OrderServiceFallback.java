package com.hang.cloud.service.fallback;

import com.hang.cloud.service.OrderService;

public class OrderServiceFallback implements OrderService {

    @Override
    public String queryOrderById(Long id) {
        return "Orz ..";
    }

}
