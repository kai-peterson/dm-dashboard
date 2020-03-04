package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatsRepository extends JpaRepository<Stats, Long> {
//    Optional<Stats> findByHealth(int health);
    Optional<Stats> findByNpcId(long npc_id);
}
