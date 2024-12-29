package com.example.java_code_learn.task8_stream_lists_of_orders.entity;

import java.util.Objects;

public class Order {
    private String product;
    private double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(cost, order.cost) == 0 && Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, cost);
    }
}
