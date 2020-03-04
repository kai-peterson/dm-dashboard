package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "npc")
public class Npc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "session_id")
    private int session_id;
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private int level;
    @Column(name = "class")
    private String character_class;
    @Column(name = "age")
    private int age;
    @Column(name = "height_feet")
    private int height_feet;
    @Column(name = "height_inches")
    private int height_inches;
    @Column(name = "weight")
    private int weight;
    @Column(name = "eye_color")
    private String eye_color;
    @Column(name = "skin_color")
    private String skin_color;
    @Column(name = "hair")
    private String hair;
    @Column(name = "important")
    private boolean important;
    @Column(name = "notes")
    private String notes;
    @OneToOne(fetch = FetchType.EAGER)
    private Stats stats;

    public Npc() {};

    public Npc(int session_id, String name, int level, String character_class, int age, int height_feet, int height_inches, int weight, String eye_color, String skin_color, String hair) {
        this.session_id = session_id;
        this.name = name;
        this.level = level;
        this.character_class = character_class;
        this.age = age;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
        this.weight = weight;
        this.eye_color = eye_color;
        this.skin_color = skin_color;
        this.hair = hair;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
