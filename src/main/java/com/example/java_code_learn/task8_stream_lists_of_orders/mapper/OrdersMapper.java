package com.example.java_code_learn.task8_stream_lists_of_orders.mapper;

import com.example.java_code_learn.task8_stream_lists_of_orders.entity.Order;

import java.util.*;
import java.util.stream.Collectors;

public class OrdersMapper {
    public void mapOrdersToConditions(List<Order> orders) {
        Map<String, Double> ordersAndSum = orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct,
                        Collectors.summingDouble(Order::getCost)));

        List<Map.Entry<String, Double>> sortedProducts = ordersAndSum.entrySet().stream()
                .sorted(Map.Entry.<String,
                        Double>comparingByValue().reversed())
                .limit(3)
                .toList();
        sortedProducts.forEach(System.out::println);
    }
}