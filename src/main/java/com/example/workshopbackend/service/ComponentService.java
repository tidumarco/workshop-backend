package com.example.workshopbackend.service;

import com.example.workshopbackend.model.Component;
import com.example.workshopbackend.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComponentService {

    private final ComponentRepository componentRepository;

    @Autowired
    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    @Transactional()
    public List<Component> getAllComponents() {
        return componentRepository.getAllComponents();
    }
}
