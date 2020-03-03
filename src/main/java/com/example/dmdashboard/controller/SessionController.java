package com.example.dmdashboard.controller;

import com.example.dmdashboard.model.Session;
import com.example.dmdashboard.repository.SessionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SessionController {

    private final SessionRepository repository;

    public SessionController(SessionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/session")
    List<Session> all() {
        return (List<Session>) repository.findAll();
    }

    @PostMapping("/session")
    Session newSession(@RequestBody Session newSession) {
        return repository.save(newSession);
    }

    @GetMapping("/session/{id}")
    Optional<Session> session(@PathVariable long id) {
        return repository.findById(id);
    }

    @PutMapping("/session/{id}")
    Optional<Session> editSession(@RequestBody Session newSession, @PathVariable long id) {
        return repository.findById(id)
                    .map(session -> {
                        session.setName(newSession.getName());
                        session.setNumber(newSession.getNumber());
                        return repository.save(newSession);
                    });
    }

    @DeleteMapping("/session/{id}")
    void deleteSession(@PathVariable long id) {
        repository.deleteById(id);
    }

}
