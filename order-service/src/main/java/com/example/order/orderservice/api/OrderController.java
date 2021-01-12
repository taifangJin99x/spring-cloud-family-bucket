package com.example.order.orderservice.api;

import com.example.order.orderservice.client.StorageClient;
import com.example.order.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.order.orderservice.api-> OrderController
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:11
 * @version: 1.0
 * @todo:
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    StorageClient storageClient;

    @GetMapping("/getOrder")
    public String getOrder() {

        return orderService.selectAll();
    }
    @GetMapping("/test")
    public String testClient() {
        log.info("TEST");
        return storageClient.test();
    }
}
