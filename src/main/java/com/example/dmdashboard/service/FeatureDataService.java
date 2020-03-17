package com.example.dmdashboard.service;

import com.example.dmdashboard.data.FeatureDataPost;
import com.example.dmdashboard.model.CharacterClass;
import com.example.dmdashboard.model.Feature;
import com.example.dmdashboard.model.Subclass;
import com.example.dmdashboard.repository.CharacterClassRepository;
import com.example.dmdashboard.repository.SubclassRepository;
import org.springframework.stereotype.Component;

@Component
public class FeatureDataService {

    private final CharacterClassRepository xRepository;
    private final SubclassRepository xSubclassRepository;

    public FeatureDataService(CharacterClassRepository xRepository, SubclassRepository xSubclassRepository) {
        this.xRepository = xRepository;
        this.xSubclassRepository = xSubclassRepository;
    }

    public Feature createFeature(FeatureDataPost featureData) {
        CharacterClass characterClass = xRepository.findByIndex(featureData.getClassName());
        if (featureData.getSubclassName() != "none") {
            Subclass subclass = xSubclassRepository.findByName(featureData.getSubclassName());
            return new Feature(featureData.getName(), featureData.getIndex(), featureData.getDescription(), featureData.getLevel(), featureData.getUrl(), characterClass, subclass);
        } else {
            return new Feature(featureData.getName(), featureData.getIndex(), featureData.getDescription(), featureData.getLevel(), featureData.getUrl(), characterClass);
        }
    }

}
