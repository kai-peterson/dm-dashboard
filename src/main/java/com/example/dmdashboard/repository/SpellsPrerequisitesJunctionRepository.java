package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.SpellsPrerequisitesJunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpellsPrerequisitesJunctionRepository extends JpaRepository<SpellsPrerequisitesJunction, Long> {

    List<SpellsPrerequisitesJunction> findBySpellsId(long id);

}
