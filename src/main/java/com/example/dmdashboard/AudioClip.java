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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
