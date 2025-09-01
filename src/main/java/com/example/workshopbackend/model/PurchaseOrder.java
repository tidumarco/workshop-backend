package com.example.workshopbackend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Purchase_Order")
public class PurchaseOrder {

    @Id
    @Column(name = "PurchaseOrderID")
    private Integer purchaseOrderId;

    private LocalDateTime creationDate;

    private String customerId;

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
