package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class QualityStatement {

    @JsonProperty("QualityStatementID")
    private int qualityStatementID;

    @JsonProperty("Statement")
    private String statement;

    @JsonProperty("OutcomeTypeID")
    private String outcomeTypeID;

    @JsonProperty("Values")
    private Map<String, Object> values;
}
