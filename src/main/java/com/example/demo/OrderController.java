package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/orders")
    public List<OrderDetails> getAllOrders(){
        return orderService.getAllOrders();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/orders/")
    public void addOrder(@RequestBody OrderDetails orderDetails){
        orderService.placeOrder(orderDetails);
    }
    @RequestMapping("orders/{id}")
    public Optional<OrderDetails> getOrderById(@PathVariable String id){
        return orderService.getOrder(id);
    }
}
