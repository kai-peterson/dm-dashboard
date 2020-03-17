package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Spell;
import com.example.dmdashboard.repository.SpellRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpellController {

    private final SpellRepository repository;

    SpellController(SpellRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/spells")
    List<Spell> all() {
        return repository.findAll();
    }

    @PostMapping("/spells")
    Spell newSpell(@RequestBody Spell newSpell) {
        return repository.save(newSpell);
    }

    @GetMapping("/spell/{id}")
    Spell spell(@PathVariable long id) {
        return repository.findById(id)
                .orElseThrow();
    }

}
