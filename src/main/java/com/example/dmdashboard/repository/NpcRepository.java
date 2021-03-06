package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Npc;
import com.example.dmdashboard.model.Stats;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NpcRepository extends CrudRepository<Npc, Long> {
    @Query(value = "select * from npc where npc.important = true", nativeQuery = true)
    List<Npc> findImportantNpcs();
    @Query(value = "select * from stats where id = :id", nativeQuery = true)
    Stats grabStats(long id);
}
