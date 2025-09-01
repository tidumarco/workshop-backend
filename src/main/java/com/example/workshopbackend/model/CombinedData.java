package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;

import java.util.List;

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "CombinedData.GetInspectionReport",
                procedureName = "GetInspectionReport",
                resultClasses = CombinedData.class
        )
})
public class CombinedData {

    @JsonProperty("ComponentTypeID")
    private String componentTypeID;

    @JsonProperty("ServiceOrderID")
    private String serviceOrderID;

    @JsonProperty("Components")
    private List<Component> components;

    @JsonProperty("QualityStatements")
    private List<QualityStatement> qualityStatements;
}
