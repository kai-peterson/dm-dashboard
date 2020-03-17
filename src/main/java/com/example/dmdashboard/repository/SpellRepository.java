package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellRepository extends JpaRepository<Spell, Long> {
    Spell findByName(String name);
}
