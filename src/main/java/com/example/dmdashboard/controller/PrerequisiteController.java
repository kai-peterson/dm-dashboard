package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Prerequisite;
import com.example.dmdashboard.repository.PrerequisiteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrerequisiteController {

    private final PrerequisiteRepository repository;

    public PrerequisiteController(PrerequisiteRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/prerequisites")
    Prerequisite newPrerequisite(@RequestBody Prerequisite newPrerequisite) {
        return repository.save(newPrerequisite);
    }

}
