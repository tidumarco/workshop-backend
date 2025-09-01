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

    @GetMapping("/{id}")
    public ResponseEntity<Component> getComponentById(@PathVariable Long id) {
        Component component = componentService.getComponentById(id);
        if (component != null) {
            return ResponseEntity.ok(component);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
