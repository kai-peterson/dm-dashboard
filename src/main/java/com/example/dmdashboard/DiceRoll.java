package com.example.dmdashboard;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dicerolls")
public class DiceRoll {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "equation")
    private String equation;
    @Column(name = "result")
    private double result;

    public DiceRoll() {};

    public DiceRoll(String equation, double result) {
        this.equation = equation;
        this.result = result;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
