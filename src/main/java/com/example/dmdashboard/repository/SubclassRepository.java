package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Subclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubclassRepository extends JpaRepository<Subclass, Long> {
    List<Subclass> findByCharacterClass_Id(Long id);
    Subclass findByName(String name);
    Subclass findByIndex(String index);
}
