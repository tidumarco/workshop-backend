package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "Component")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Component.getAllComponentsProcedure",
                procedureName = "GetComponents", // your stored procedure name
                resultClasses = Component.class
        ),
        @NamedStoredProcedureQuery(
                name = "Component.getComponentByIdProcedure",
                procedureName = "get_component_by_id",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "component_id", type = Long.class)
                },
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
    private String SerialNumber;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }
}
