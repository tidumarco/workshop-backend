package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "Component_Type")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "ComponentType.getAllComponentTypesProcedure",
                procedureName = "GetComponentTypes",
                resultClasses = ComponentType.class
        )
})
public class ComponentType {

    @Id
    @Column(name = "ComponentTypeID")
    @JsonProperty("ComponentTypeID")
    private Integer componentTypeId;

    @Column(name = "ComponentTypeCode")
    @JsonProperty("ComponentTypeCode")
    private String componentTypeCode;

    @Column(name = "ComponentTypeName")
    @JsonProperty("ComponentTypeTypeName")
    private String componentTypeName;
}
