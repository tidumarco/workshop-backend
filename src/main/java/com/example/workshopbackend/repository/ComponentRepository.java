package com.example.workshopbackend.repository;

import com.example.workshopbackend.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Long> {

    @Procedure(name = "Component.getAllComponentsProcedure")
    List<Component> getAllComponents();
}
