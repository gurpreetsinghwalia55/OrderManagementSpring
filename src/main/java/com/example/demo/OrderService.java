package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order1> getAllOrders(){
        List<Order1> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }
    public void placeOrder(Order1 order){
        orderRepository.save(order);
    }
    public Optional<Order1> getOrder(String id){
        Optional<Order1> order = orderRepository.findById(id);
        return order;
    }
}
