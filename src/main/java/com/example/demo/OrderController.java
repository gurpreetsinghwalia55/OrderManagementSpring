package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/orders")
    public List<Order1> getAllOrders(){
        return orderService.getAllOrders();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/orders/{id}")
    public void addOrder(@RequestBody Order1 order1){
        orderService.placeOrder(order1);
    }
}
