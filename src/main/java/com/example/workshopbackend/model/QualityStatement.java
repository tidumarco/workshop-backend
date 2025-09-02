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

    @Column(name = "GroupID")
    @JsonProperty("GroupID")
    private int groupID;

    @Transient
    @JsonProperty("Values")
    private Map<String, Object> values;
}
