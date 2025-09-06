package com.example.workshopbackend.service;

import com.example.workshopbackend.model.CombinedData;
import com.example.workshopbackend.model.Component;
import com.example.workshopbackend.model.QualityStatement;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Service
public class CombinedDataService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final ComponentService componentService;
    private final QualityStatementService qualityStatementService;

    public CombinedDataService(ComponentService componentService, QualityStatementService qualityStatementService) {
        this.componentService = componentService;
        this.qualityStatementService = qualityStatementService;
    }

    public List<CombinedData> getCombinedDataFromDatabase() throws IOException {
        List<Component> componentsFromDB = componentService.getAllComponents();
        List<QualityStatement> qualityStatementsFromDB = qualityStatementService.getAllQualityStatements();
        List<CombinedData> combinedData = new ArrayList<>();
        CombinedData combinedData1 = new CombinedData();
        combinedData1.setComponents(componentsFromDB);
        combinedData1.setQualityStatements(qualityStatementsFromDB);
        combinedData1.setComponentTypeID(componentsFromDB.get(0).getComponentTypeId());
        combinedData1.setServiceOrderID(componentsFromDB.get(0).getServiceOrderId());
        combinedData.add(combinedData1);

        Map<Integer, Object> flagValues = new HashMap<>();
        Map<Integer, Object> textValues = new HashMap<>();
        Map<Integer, Object> numberValues = new HashMap<>();
        Map<Integer, Object> pictureValues = new HashMap<>();

        for (Component component : componentsFromDB) {
            flagValues.put(component.getComponentId(), false);
            textValues.put(component.getComponentId(), "");
            numberValues.put(component.getComponentId(), 0);
            pictureValues.put(component.getComponentId(), "");
        }

        qualityStatementsFromDB.forEach(qualityStatement -> {
            if (Objects.equals(qualityStatement.getOutcomeTypeID(), "flag")) {
                qualityStatement.setValues(flagValues);
            } else if (Objects.equals(qualityStatement.getOutcomeTypeID(), "text")) {
                qualityStatement.setValues(textValues);
            } else if (Objects.equals(qualityStatement.getOutcomeTypeID(), "number")) {
                qualityStatement.setValues(numberValues);
            } else if (Objects.equals(qualityStatement.getOutcomeTypeID(), "picture")) {
                qualityStatement.setValues(pictureValues);
            }
        });

        return combinedData;
    }
}
