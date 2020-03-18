package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Prerequisite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrerequisiteRepository extends JpaRepository<Prerequisite, Long> {
    Prerequisite findByUrlAndType(String url, String type);
    Prerequisite findByNameAndUrl(String name, String url);
    Prerequisite findByUrl(String url);
}
