package com.example.dmdashboard.service;

import com.example.dmdashboard.data.SubclassData;
import com.example.dmdashboard.model.Subclass;
import com.example.dmdashboard.repository.SubclassRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubclassService {

    private SubclassRepository repository;

    public SubclassService(SubclassRepository repository) {
        this.repository = repository;
    }

    public List<SubclassData> getAllSubclasses() {
        List<Subclass> allSubclasses = repository.findAll();
        List<SubclassData> newSubclasses = new ArrayList<>();
        allSubclasses.forEach((subclasses -> {
            SubclassData subclass = new SubclassData(subclasses.getName(), subclasses.getUrl());
            newSubclasses.add(subclass);
        }));
        return newSubclasses;
    }

    public List<SubclassData> getSpecificSubclasses(long id) {
        List<Subclass> subclasses = repository.findByCharacterClass_Id(id);
        List<SubclassData> subclassData = new ArrayList<>();
        subclasses.forEach(subclass -> {
            SubclassData data = new SubclassData(subclass.getName(), subclass.getUrl());
            subclassData.add(data);
        });
        return subclassData;
    }

//    public Subclass prepareSubclassForPost(SubclassDataPost subclassDataPost) {
//
//    }

}
