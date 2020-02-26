package com.example.dmdashboard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiceRollRepository extends CrudRepository<DiceRoll, Long> {
    @Query(value = "select * from dicerolls order by id desc limit 10", nativeQuery = true)
    List<DiceRoll> getLatestCalculations();
}
