package com.example.workshopbackend.repository;

import com.example.workshopbackend.model.ComponentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentTypeRepository extends JpaRepository<ComponentType, Long> {

    @Procedure(name = "ComponentType.getAllComponentTypesProcedure")
    List<ComponentType> getAllComponentTypes();
}
