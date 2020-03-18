package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Spells;
import com.example.dmdashboard.repository.SpellsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpellsController {

    private final SpellsRepository repository;

    public SpellsController(SpellsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/spells-for-subclasses")
    List<Spells> all() {
        return repository.findAll();
    }

    @GetMapping("/spells-for-subclasses/{id}")
    List<Spells> forSubclass(@PathVariable long id) {
        return repository.findBySubclass(id);
    }

    @PostMapping("/spells-for-subclasses")
    Spells newSpells(@RequestBody Spells newSpells) {
        return repository.save(newSpells);
    }

}
