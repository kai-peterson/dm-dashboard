package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.MagicSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicSchoolRepository extends JpaRepository<MagicSchool, Long> {
    MagicSchool findByIndex(String index);
}
