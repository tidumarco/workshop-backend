package com.example.workshopbackend.controller;

import com.example.workshopbackend.model.QualityStatement;
import com.example.workshopbackend.service.QualityStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quality-statements")
public class QualityStatementController {

    private final QualityStatementService qualityStatementService;

    @Autowired
    public QualityStatementController(QualityStatementService qualityStatementService) {
        this.qualityStatementService = qualityStatementService;
    }

    @GetMapping
    public ResponseEntity<List<QualityStatement>> getAllQualityStatements() {
        List<QualityStatement> qualityStatements = qualityStatementService.getAllQualityStatements();
        return ResponseEntity.ok(qualityStatements);
    }
}
