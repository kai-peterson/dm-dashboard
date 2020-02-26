package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.Calculation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculationsRepository extends CrudRepository<Calculation, Long> {
    @Query(value = "select * from calculations order by id desc limit 10", nativeQuery = true)
    List<Calculation> getLatestCalculations();
}
