package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.DiceRoll;
import com.example.dmdashboard.repository.DiceRollsRepository;
import com.example.dmdashboard.service.AddDice;
import com.example.dmdashboard.service.RollDice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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
        // business logic to roll dice and add rolls
        int[] rolls = RollDice.rollDice(newRoll.getRolls());
        int result = AddDice.addRolls(rolls);
        String rollsString = Arrays.toString(rolls);
        newRoll.setRolls(rollsString.substring(1, rollsString.length() - 1));
        newRoll.setResult(result);
        return repository.save(newRoll);
    }

    @GetMapping("/rolls/history")
    List<DiceRoll> history() {
        return repository.getLatestRolls();
    }
}
