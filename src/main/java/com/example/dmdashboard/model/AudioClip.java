package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "audioclips")
public class AudioClip {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "link")
    private String link;

    public AudioClip() {}

    public AudioClip(String link, String description) {
        this.link = link;
        this.description = description;
    }

}
