package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "Component")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Component.getAllComponentsProcedure",
                procedureName = "GetComponents",
                resultClasses = Component.class
        )
})
public class Component {

    @Id
    @Column(name = "ComponentID")
    @JsonProperty("ComponentID")
    private Integer componentId;

    @JsonProperty("ServiceOrderID")
    private Integer serviceOrderId;

    @JsonProperty("ComponentTypeID")
    private Integer componentTypeId;

    @JsonProperty("SerialNumber")
    private String serialNumber;

    @JsonProperty("FlagOutcome")
    private Boolean flagOutcome;

    @JsonProperty("FreeTextOutcome")
    private String freeTextOutcome;

    @JsonProperty("NumberOutcome")
    private Float numberOutcome;

    @JsonProperty("PictureOutcome")
    private String pictureOutcome;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }
}
