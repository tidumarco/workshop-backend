package com.example.workshopbackend.controller;

import com.example.workshopbackend.model.Component;
import com.example.workshopbackend.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/components")
public class ComponentController {

    private final ComponentService componentService;

    @Autowired
    public ComponentController(ComponentService componentService) {
        this.componentService = componentService;
    }

    @GetMapping
    public ResponseEntity<List<Component>> getAllComponents() {
        List<Component> components = componentService.getAllComponents();
        return ResponseEntity.ok(components);
    }
}
