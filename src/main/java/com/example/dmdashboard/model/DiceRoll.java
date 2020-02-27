package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dicerolls")
public class DiceRoll {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rolls")
    private String rolls;
    @Column(name = "result")
    private int result;

    public DiceRoll() {}

    public DiceRoll(String rolls, int result) {
        this.rolls = rolls;
        this.result = result;
    }

}
