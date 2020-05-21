package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<OrderDetails> getAllOrders(){
        List<OrderDetails> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        return orders;
    }
    public void placeOrder(OrderDetails order){
        orderRepository.save(order);
    }
    public Optional<OrderDetails> getOrder(String id){
        Optional<OrderDetails> order = orderRepository.findById(id);
        return order;
    }
}
