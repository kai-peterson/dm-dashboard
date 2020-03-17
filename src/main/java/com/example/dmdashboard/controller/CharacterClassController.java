package com.example.dmdashboard.controller;

import com.example.dmdashboard.data.CharacterClassData;
import com.example.dmdashboard.model.CharacterClass;
import com.example.dmdashboard.repository.CharacterClassRepository;
import com.example.dmdashboard.repository.SubclassRepository;
import com.example.dmdashboard.service.CharacterClassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterClassController {

    private final CharacterClassRepository repository;
    private final SubclassRepository subclassRepository;
    private final CharacterClassService characterClassService;

    CharacterClassController(CharacterClassRepository repository, SubclassRepository subclassRepository, CharacterClassService characterClassService) {
        this.repository = repository;
        this.subclassRepository = subclassRepository;
        this.characterClassService = characterClassService;
    }

    @GetMapping("/classes")
    List<CharacterClass> all() {
        return repository.findAll();
    }

    @PostMapping("/classes")
    CharacterClass newCharClass(@RequestBody CharacterClass newCharacterClass) {
        return repository.save(newCharacterClass);
    }

    @GetMapping("/classes/{index}")
    CharacterClassData getClassByName(@PathVariable String index) {
        return characterClassService.getCharacterClass(index);
    }

}
