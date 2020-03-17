package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "monster_list")
public class MonsterList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "challenge_rating")
    private int challenge_rating;
    @Column(name = "url")
    private String url;

    public MonsterList() {}

    public MonsterList(String name, int challenge_rating, String url) {
        this.name = name;
        this.challenge_rating = challenge_rating;
        this.url = url;
    }
}
