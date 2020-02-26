package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.DiceRoll;
import com.example.dmdashboard.repository.DiceRollsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiceRollsController {

    private final DiceRollsRepository repository;

    public DiceRollsController(DiceRollsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/rolls")
    List<DiceRoll> all() {
        return (List<DiceRoll>) repository.findAll();
    }

    @PostMapping("/rolls")
    DiceRoll newRoll(@RequestBody DiceRoll newRoll) {
        // business logic to add up rolls
        return repository.save(newRoll);
    }

    @GetMapping("/rolls/history")
    List<DiceRoll> history() {
        return repository.getLatestRolls();
    }
}
