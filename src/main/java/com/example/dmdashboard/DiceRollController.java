package com.example.dmdashboard;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiceRollController {

    private final DiceRollRepository repository;

    public DiceRollController(DiceRollRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/calculations")
    List<DiceRoll> all() {
        return (List<DiceRoll>) repository.findAll();
    }

    @PostMapping("/calculations")
    DiceRoll newRoll(@RequestBody DiceRoll newRoll) {
        double result = CalculateResult.calculateResult(newRoll.getEquation());
        newRoll.setResult(result);
        return repository.save(newRoll);
    }

    @GetMapping("/calculations/history")
    List<DiceRoll> history() {
        return repository.getLatestCalculations();
    }
}
