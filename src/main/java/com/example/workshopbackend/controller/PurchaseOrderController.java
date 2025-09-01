package com.example.workshopbackend.controller;

import com.example.workshopbackend.model.PurchaseOrder;
import com.example.workshopbackend.repository.PurchaseOrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-orders")
public class PurchaseOrderController {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderController(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PurchaseOrder> getAllOrders() {
        return repository.findAll();
    }

    @PostMapping
    public PurchaseOrder createOrder(@RequestBody PurchaseOrder order) {
        return repository.save(order);
    }

    @GetMapping("/{id}")
    public PurchaseOrder getOrderById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
