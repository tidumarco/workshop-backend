package com.example.workshopbackend.repository;

import com.example.workshopbackend.model.QualityStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityStatementRepository extends JpaRepository<QualityStatement, Long> {

    @Procedure(name = "QualityStatement.getAllQualityStatementsProcedure")
    List<QualityStatement> getAllQualityStatements();
}
