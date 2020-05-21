package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order1 {
    @Id
    private String id;
    private String price, quantity, orderTotal;
    private String itemName;
    public Order1(){

    }
    public Order1(String id, String price, String quantity, String orderTotal, String itemName) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.orderTotal = orderTotal;
        this.itemName = itemName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
