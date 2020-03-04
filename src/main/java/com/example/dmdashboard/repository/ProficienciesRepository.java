package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Proficiencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProficienciesRepository extends JpaRepository<Proficiencies, Long> {
    Proficiencies findByNpc_id(long npc_ic);
}
