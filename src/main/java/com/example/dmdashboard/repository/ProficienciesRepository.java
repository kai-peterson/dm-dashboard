package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Proficiencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProficienciesRepository extends JpaRepository<Proficiencies, Long> {
    Optional<Proficiencies> findByNpcId(long npc_id);
}
