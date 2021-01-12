package com.example.order.orderservice.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.order.orderservice.entity.Order;
import com.example.order.orderservice.repository.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: com.example.order.orderservice.service-> OrderService
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:11
 * @version: 1.0
 * @todo:
 */
@Service
public class OrderService {
    @Autowired
    OrderDAO orderDAO;
    public String selectAll() {
        Order order = orderDAO.selectById("1");
        return order.toString();

    }
}
