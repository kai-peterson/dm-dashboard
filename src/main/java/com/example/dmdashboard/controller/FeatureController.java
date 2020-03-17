package com.example.dmdashboard.controller;

import com.example.dmdashboard.data.FeatureDataPost;
import com.example.dmdashboard.model.Feature;
import com.example.dmdashboard.repository.CharacterClassRepository;
import com.example.dmdashboard.repository.FeatureRepository;
import com.example.dmdashboard.repository.SubclassRepository;
import com.example.dmdashboard.service.FeatureDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeatureController {

    private final FeatureRepository repository;
    private final CharacterClassRepository characterClassRepository;
    private final SubclassRepository subclassRepository;
    private FeatureDataService featureDataService;

    public FeatureController(FeatureRepository repository, CharacterClassRepository characterClassRepository, SubclassRepository subclassRepository, FeatureDataService featureDataService) {
        this.repository = repository;
        this.characterClassRepository = characterClassRepository;
        this.subclassRepository = subclassRepository;
        this.featureDataService = featureDataService;
    }

    @GetMapping("/features")
    List<Feature> all() {
        return repository.findAll();
    }

    @PostMapping("/features")
    Feature newFeature(@RequestBody FeatureDataPost newFeatureData) {
        return repository.save(featureDataService.createFeature(newFeatureData));
    }

}
