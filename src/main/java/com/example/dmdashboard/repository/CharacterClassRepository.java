package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterClassRepository extends JpaRepository<CharacterClass, Long> {
    CharacterClass findByIndex(String index);
    CharacterClass findByName(String name);
}
