package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "prerequisites")
public class Prerequisite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "url")
    private String url;

    public Prerequisite(String name) {}

    public Prerequisite(String name, String type, String url) {
        this.name = name;
        this.type = type;
        this.url = url;
    }

}
