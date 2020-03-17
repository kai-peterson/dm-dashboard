package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.MagicSchool;
import com.example.dmdashboard.repository.MagicSchoolRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MagicSchoolController {

    private final MagicSchoolRepository repository;

    public MagicSchoolController(MagicSchoolRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/magic-schools")
    List<MagicSchool> all() {
        return repository.findAll();
    }

    @PostMapping("/api/magic-schools")
    MagicSchool newMagicSchool(@RequestBody MagicSchool newMagicSchool) {
        return repository.save(newMagicSchool);
    }

    @GetMapping("/api/magic-school/{index}")
    MagicSchool magicSchool(@PathVariable String index) {
        return repository.findByIndex(index);
    }

}
