package com.example.orderservice.controller;

import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private ProductClient productClient;

    @GetMapping
    public List<Order> getAllOrders() {

        return orderRepo.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {

        return orderRepo.save(order);
    }

    @GetMapping("/products")
    public Object getProductsFromProductService() {

        return productClient.getAllProducts();
    }
}
