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
}