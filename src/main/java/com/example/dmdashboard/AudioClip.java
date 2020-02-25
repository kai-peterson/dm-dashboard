package com.example.dmdashboard;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "audioclips")
public class AudioClip {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String link;
    private String description;

    public AudioClip() {}

    public AudioClip(String link, String description) {
        this.link = link;
        this.description = description;
    }
}
