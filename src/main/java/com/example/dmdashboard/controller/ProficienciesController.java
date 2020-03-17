package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Proficiencies;
import com.example.dmdashboard.repository.ProficienciesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProficienciesController {

    private final ProficienciesRepository repository;

    ProficienciesController(ProficienciesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/proficiencies")
    List<Proficiencies> all() {
        return repository.findAll();
    }

    @PostMapping("/proficiencies")
    Proficiencies newProficiencies(@RequestBody Proficiencies newProficiencies) {
        return repository.save(newProficiencies);
    }

//    @GetMapping("/proficiencies/{id}")
//    Proficiencies findNpcProficiencies(@PathVariable long id) {
//        return repository.findByNpcId(id)
//                    .orElseThrow();
//    }

}
