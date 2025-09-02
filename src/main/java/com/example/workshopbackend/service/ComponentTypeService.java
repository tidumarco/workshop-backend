package com.example.workshopbackend.service;

import com.example.workshopbackend.model.ComponentType;
import com.example.workshopbackend.repository.ComponentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComponentTypeService {

    private final ComponentTypeRepository componentTypeRepository;

    @Autowired
    public ComponentTypeService(ComponentTypeRepository componentTypeRepository) {
        this.componentTypeRepository = componentTypeRepository;
    }

    @Transactional()
    public List<ComponentType> getAllComponentTypes() {
        return componentTypeRepository.getAllComponentTypes();
    }
}
