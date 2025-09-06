package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CombinedData {

    @JsonProperty("ComponentTypeID")
    private String componentTypeID;

    @JsonProperty("ServiceOrderID")
    private String serviceOrderID;

    @JsonProperty("Components")
    private List<Component> components;

    @JsonProperty("QualityStatements")
    private List<QualityStatement> qualityStatements;

    public void setQualityStatements(List<QualityStatement> qualityStatements) {
        this.qualityStatements = qualityStatements;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public void setServiceOrderID(String serviceOrderID) {
        this.serviceOrderID = serviceOrderID;
    }

    public void setComponentTypeID(String componentTypeID) {
        this.componentTypeID = componentTypeID;
    }
}