package com.example.java_code_learn.task8_stream_lists_of_orders;

import com.example.java_code_learn.task8_stream_lists_of_orders.entity.Order;
import com.example.java_code_learn.task8_stream_lists_of_orders.mapper.OrdersMapper;

import java.util.List;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );
        OrdersMapper mapper = new OrdersMapper();
        mapper.mapOrdersToConditions(orders);
    }
}