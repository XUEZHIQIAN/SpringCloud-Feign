package com.hang.cloud.service;

import com.hang.cloud.service.fallback.OrderServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * api
 *
 * @author Hang W
 */
@FeignClient(name = "order-service", fallback = OrderServiceFallback.class)
public interface OrderService {

    @GetMapping("order/{id}")
    String queryOrderById(@PathVariable(value="id") Long id);

}
