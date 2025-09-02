package com.example.workshopbackend.service;

import com.example.workshopbackend.model.PurchaseOrder;
import com.example.workshopbackend.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    @Transactional()
    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepository.getAllPurchaseOrders();
    }
}
