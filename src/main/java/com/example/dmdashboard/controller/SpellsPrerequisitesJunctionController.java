package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.SpellsPrerequisitesJunction;
import com.example.dmdashboard.repository.SpellsPrerequisitesJunctionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpellsPrerequisitesJunctionController {

    private final SpellsPrerequisitesJunctionRepository repository;

    public SpellsPrerequisitesJunctionController(SpellsPrerequisitesJunctionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/spells-prerequisites")
    List<SpellsPrerequisitesJunction> all() {
        return repository.findAll();
    }

    @GetMapping("/spells-prerequisites/{id}")
    List<SpellsPrerequisitesJunction> forSpells(@PathVariable long id) {
        return repository.findBySpellsId(id);
    }

    @PostMapping("/spells-prerequisites")
    SpellsPrerequisitesJunction newSpellsPrerequisitesJunction(@RequestBody SpellsPrerequisitesJunction newSpellsPrerequisitesJunction) {
        return repository.save(newSpellsPrerequisitesJunction);
    }

}
