package com.example.dmdashboard.controller;

import com.example.dmdashboard.service.CalculateResult;
import com.example.dmdashboard.repository.CalculationsRepository;
import com.example.dmdashboard.model.Calculation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculationsController {

    private final CalculationsRepository repository;

    public CalculationsController(CalculationsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/calculations")
    List<Calculation> all() {
        return (List<Calculation>) repository.findAll();
    }

    @PostMapping("/calculations")
    Calculation newCalculation(@RequestBody Calculation newCalculation) {
        double result = CalculateResult.calculateResult(newCalculation.getEquation());
        newCalculation.setResult(result);
        return repository.save(newCalculation);
    }

    @GetMapping("/calculations/history")
    List<Calculation> history() {
        return repository.getLatestCalculations();
    }
}
