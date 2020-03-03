package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;

    public Session() {}

    public Session(String name, int number) {
        this.name = name;
        this.number = number;
    }

}
