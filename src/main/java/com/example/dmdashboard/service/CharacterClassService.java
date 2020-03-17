package com.example.dmdashboard.service;

import com.example.dmdashboard.data.CharacterClassData;
import com.example.dmdashboard.model.CharacterClass;
import com.example.dmdashboard.repository.CharacterClassRepository;
import com.example.dmdashboard.repository.SubclassRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterClassService {

    private CharacterClassRepository repository;
    private SubclassRepository subclassRepository;
    private SubclassService subclassService;

    public CharacterClassService(CharacterClassRepository repository, SubclassRepository subclassRepository, SubclassService subclassService) {
        this.repository = repository;
        this.subclassRepository = subclassRepository;
        this.subclassService = subclassService;
    }

    public CharacterClassData getCharacterClass(String index) {
        CharacterClass characterClass = repository.findByIndex(index);
        CharacterClassData characterClassData = new CharacterClassData(characterClass.getName(), characterClass.getUrl());
        characterClassData.setSubclasses(subclassService.getSpecificSubclasses(characterClass.getId()));
        return characterClassData;
    }

}
