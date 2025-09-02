package com.example.workshopbackend.controller;

import com.example.workshopbackend.model.ComponentType;
import com.example.workshopbackend.service.ComponentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/component-types")
public class ComponentTypeController {

    private final ComponentTypeService componentTypeService;

    @Autowired
    public ComponentTypeController(ComponentTypeService componentTypeService) {
        this.componentTypeService = componentTypeService;
    }

    @GetMapping
    public ResponseEntity<List<ComponentType>> getAllComponentTypes() {
        List<ComponentType> componentTypes = componentTypeService.getAllComponentTypes();
        return ResponseEntity.ok(componentTypes);
    }
}
