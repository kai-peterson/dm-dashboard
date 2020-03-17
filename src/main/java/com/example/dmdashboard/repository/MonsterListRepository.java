package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.MonsterList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterListRepository extends JpaRepository<MonsterList, Long> {
}
