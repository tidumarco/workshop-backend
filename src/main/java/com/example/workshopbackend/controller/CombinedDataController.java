package com.example.workshopbackend.controller;

import com.example.workshopbackend.model.CombinedData;
import com.example.workshopbackend.service.CombinedDataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/combined-data")
public class CombinedDataController {

    private final CombinedDataService combinedDataService;
    private final Logger logger = Logger.getLogger(CombinedDataController.class.getName());

    @Autowired
    public CombinedDataController(CombinedDataService combinedDataService) {
        this.combinedDataService = combinedDataService;
    }

    @GetMapping
    public ResponseEntity<?> getCombinedData() {
        try {
            List<CombinedData> data = combinedDataService.getCombinedDataFromDatabase();
//            List<CombinedData> data = combinedDataService.getCombinedDataFromJson();

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
            logger.info("Data retrieved:" + json);

            return ResponseEntity.ok(data);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to load combined data: " + e.getMessage());
        }
    }
}
