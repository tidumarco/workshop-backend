package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Purchase_Order")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "PurchaseOrder.getAllComponentsProcedure",
                procedureName = "GetPurchaseOrders",
                resultClasses = PurchaseOrder.class
        )
})
public class PurchaseOrder {

    @Id
    @Column(name = "PurchaseOrderID")
    @JsonProperty("PurchaseOrderID")
    private Integer purchaseOrderId;

    @Column(name = "CreationDate")
    @JsonProperty("CreationDate")
    private LocalDateTime creationDate;

    @Column(name = "CustomerID")
    @JsonProperty("CustomerID")
    private String customerId;

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
}
