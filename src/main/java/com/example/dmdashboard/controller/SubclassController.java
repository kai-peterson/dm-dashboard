package com.example.dmdashboard.controller;

import com.example.dmdashboard.data.SubclassData;
import com.example.dmdashboard.model.Subclass;
import com.example.dmdashboard.repository.SubclassRepository;
import com.example.dmdashboard.service.SubclassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SubclassController {

    private final SubclassRepository repository;
    private SubclassService subclassService;

    public SubclassController(SubclassRepository repository, SubclassService subclassService) {
        this.repository = repository;
        this.subclassService = subclassService;
    }

    @GetMapping("/subclasses")
    List<SubclassData> all() {
        return subclassService.getAllSubclasses();
    }

    @GetMapping("/subclasses/{id}")
    Optional<Subclass> subclasses(@PathVariable long id) {
        return repository.findById(id);
    }

//    @PostMapping("/subclasses")
//    Subclass subclass(@RequestBody SubclassDataPost subclassDataPost) {
//
//    }

}
