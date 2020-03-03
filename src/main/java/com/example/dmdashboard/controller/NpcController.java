package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Npc;
import com.example.dmdashboard.repository.NpcRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NpcController {

    private final NpcRepository repository;

    NpcController(NpcRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/npc")
    List<Npc> all() {
        return (List<Npc>) repository.findAll();
    }

    @GetMapping("/npc/important")
    List<Npc> important() {
        return repository.findImportantNpcs();
    }

    @PostMapping("/npc")
    Npc newNpc(@RequestBody Npc newNpc) {
        return  repository.save(newNpc);
    }

    @GetMapping("/npc/{id}")
    Optional<Npc> npc(@PathVariable long id) {
        return repository.findById(id);
    }

    @PutMapping("/npc/{id}")
    Optional<Npc> editNpc(@RequestBody Npc newNpc, @PathVariable long id) {
        return repository.findById(id)
                    .map(npc -> {
                        npc.setSession_id(newNpc.getSession_id());
                        npc.setCharacter_class(newNpc.getCharacter_class());
                        npc.setAge(newNpc.getAge());
                        npc.setHeight_feet(newNpc.getHeight_feet());
                        npc.setHeight_inches(newNpc.getHeight_inches());
                        npc.setWeight(newNpc.getWeight());
                        npc.setEye_color(newNpc.getEye_color());
                        npc.setSkin_color(newNpc.getSkin_color());
                        npc.setHair(newNpc.getHair());
                        npc.setImportant(newNpc.isImportant());
                        npc.setNotes(newNpc.getNotes());
                        return repository.save(npc);
                    });
    }

    @DeleteMapping("/npc/{id}")
    void deleteNpc(@PathVariable long id) {
        repository.deleteById(id);
    }

}
