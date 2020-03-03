package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Npc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NpcRepository extends CrudRepository<Npc, Long> {
    @Query(value = "select * from npc where npc.important = true", nativeQuery = true)
    List<Npc> findImportantNpcs();
}
