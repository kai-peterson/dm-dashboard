package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "calculations")
public class Calculation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "equation")
    private String equation;
    @Column(name = "result")
    private double result;

    public Calculation() {};

    public Calculation(String equation, double result) {
        this.equation = equation;
        this.result = result;
    }

}
