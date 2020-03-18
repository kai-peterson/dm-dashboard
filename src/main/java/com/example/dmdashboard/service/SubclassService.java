package com.example.dmdashboard.service;

import com.example.dmdashboard.data.PrerequisiteDataPost;
import com.example.dmdashboard.data.SubclassData;
import com.example.dmdashboard.data.SubclassDataPost;
import com.example.dmdashboard.model.*;
import com.example.dmdashboard.repository.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubclassService {

    private SubclassRepository repository;
    private CharacterClassRepository characterClassRepository;
    private SpellRepository spellRepository;
    private SpellsRepository spellsRepository;
    private PrerequisiteRepository prerequisiteRepository;
    private SpellsPrerequisitesJunctionRepository spellsPrerequisitesJunctionRepository;

    public SubclassService(SubclassRepository repository, CharacterClassRepository characterClassRepository, SpellRepository spellRepository, SpellsRepository spellsRepository, PrerequisiteRepository prerequisiteRepository, SpellsPrerequisitesJunctionRepository spellsPrerequisitesJunctionRepository) {
        this.repository = repository;
        this.characterClassRepository = characterClassRepository;
        this.spellRepository = spellRepository;
        this.spellsRepository = spellsRepository;
        this.prerequisiteRepository = prerequisiteRepository;
        this.spellsPrerequisitesJunctionRepository = spellsPrerequisitesJunctionRepository;
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

    public void prepareSubclassForPost(SubclassDataPost subclassDataPost) {
        CharacterClass newCharacterClass = characterClassRepository.findByName(subclassDataPost.getClassName());
        Subclass newSubclass = new Subclass(subclassDataPost.getIndex(), subclassDataPost.getName(), subclassDataPost.getUrl(), subclassDataPost.getDescription(), subclassDataPost.getSubclassFlavor(), newCharacterClass);
        repository.save(newSubclass);
        List<PrerequisiteDataPost> prerequisites = subclassDataPost.getPrerequisiteDataPosts();
        prerequisites.forEach( prerequisiteDataPost -> {
            Spells newSpellsObject = new Spells(spellRepository.findByName(prerequisiteDataPost.getSpellName()), repository.findByIndex(newSubclass.getIndex()));
            spellsRepository.save(newSpellsObject);
            List<String> urls = prerequisiteDataPost.getPrerequisiteUrls();
            urls.forEach( url -> {
                SpellsPrerequisitesJunction newSpellsPrerequisitesJunction = new SpellsPrerequisitesJunction(newSpellsObject.getId(), prerequisiteRepository.findByUrl(url).getId());
                spellsPrerequisitesJunctionRepository.save(newSpellsPrerequisitesJunction);
            });
        });
    }

}
