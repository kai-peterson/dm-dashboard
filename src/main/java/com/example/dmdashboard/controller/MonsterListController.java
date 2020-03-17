package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.MonsterList;
import com.example.dmdashboard.repository.MonsterListRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonsterListController {

    private final MonsterListRepository repository;

    public MonsterListController(MonsterListRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/monsters")
    List<MonsterList> all() {
        return repository.findAll();
    }

    @PostMapping("/monsters")
    MonsterList newMonster(@RequestBody MonsterList newMonster) {
        return repository.save(newMonster);
    }

}
