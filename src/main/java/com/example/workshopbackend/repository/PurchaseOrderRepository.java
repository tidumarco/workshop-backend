package com.example.workshopbackend.repository;

import com.example.workshopbackend.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {
    @Procedure(name = "PurchaseOrder.getAllPurchaseOrdersProcedure")
    List<PurchaseOrder> getAllPurchaseOrders();
}
