package com.example.workshopbackend.service;

import com.example.workshopbackend.model.CombinedData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class CombinedDataService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<CombinedData> getCombinedDataFromJson() throws IOException {
        InputStream inputStream = new ClassPathResource("data/combined-data.json").getInputStream();
        return objectMapper.readValue(inputStream, new TypeReference<List<CombinedData>>() {});
    }
}
