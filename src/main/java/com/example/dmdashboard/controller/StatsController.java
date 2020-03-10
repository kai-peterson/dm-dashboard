package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Stats;
import com.example.dmdashboard.repository.StatsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatsController {

    private final StatsRepository repository;

    StatsController(StatsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/stats")
    List<Stats> all() {
        return (List<Stats>) repository.findAll();
    }

    @PostMapping("/stats")
    Stats newStats(@RequestBody Stats newStats) {
        return repository.save(newStats);
    }

}
