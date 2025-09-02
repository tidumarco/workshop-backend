package com.example.workshopbackend.service;

import com.example.workshopbackend.model.QualityStatement;
import com.example.workshopbackend.repository.QualityStatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QualityStatementService {

    private final QualityStatementRepository qualityStatementRepository;

    @Autowired
    public QualityStatementService(QualityStatementRepository qualityStatementRepository) {
        this.qualityStatementRepository = qualityStatementRepository;
    }

    @Transactional()
    public List<QualityStatement> getAllQualityStatements() {
        return qualityStatementRepository.getAllQualityStatements();
    }
}
