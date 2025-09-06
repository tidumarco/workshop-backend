package com.example.workshopbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "QualityStatement")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "QualityStatement.getAllQualityStatementsProcedure",
                procedureName = "GetQualityStatements",
                resultClasses = QualityStatement.class
        )
})
public class QualityStatement {

    @Id
    @Column(name = "QualityStatementID")
    @JsonProperty("QualityStatementID")
    private int qualityStatementID;

    @Column(name = "Statement")
    @JsonProperty("Statement")
    private String statement;

    @Column(name = "OutcomeTypeID")
    @JsonProperty("OutcomeTypeID")
    private String outcomeTypeID;

    @JsonProperty("GroupName")
    private String groupName;

    @Transient
    @JsonProperty("Values")
    private Map<Integer, Object> values;

    public Map<Integer, Object> getValues() {
        return values;
    }

    public void setValues(Map<Integer, Object> values) {
        this.values = values;
    }

    public String getOutcomeTypeID() {
        return outcomeTypeID;
    }

    public void setOutcomeTypeID(String outcomeTypeID) {
        this.outcomeTypeID = outcomeTypeID;
    }
}
