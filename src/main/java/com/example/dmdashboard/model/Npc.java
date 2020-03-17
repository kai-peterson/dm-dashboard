package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    @Column(name = "race")
    private String race;
    @Column(name = "subrace")
    private String subrace;
    @Column(name = "alignment")
    private String alignment;
    @Column(name = "sex")
    private char sex;
    @Column(name = "age")
    private int age;
    @Column(name = "personality_traits", columnDefinition = "varchar(500)")
    private String personality_traits;
    @Column(name = "ideals", columnDefinition = "varchar(500)")
    private String ideals;
    @Column(name = "bonds", columnDefinition = "varchar(500)")
    private String bonds;
    @Column(name = "flaws", columnDefinition = "varchar(500)")
    private String flaws;
    @Column(name = "background", columnDefinition = "varchar(800)")
    private String background;
    @Column(name = "other_notes_descriptors")
    private String other_notes_descriptors;
    @Column(name = "important")
    private boolean important;
    @ManyToMany
    private List<Feature> feature;
    @OneToOne(fetch = FetchType.EAGER)
    private Stats stats;
    @OneToOne(fetch = FetchType.EAGER)
    private Proficiencies proficiencies;

    public Npc() {};

    public Npc(int session_id, String name, int level, String character_class, String race, String subrace, int age, String personality_traits, String ideals, String bonds, String flaws, String background, String other_notes_descriptors, boolean important) {
        this.session_id = session_id;
        this.name = name;
        this.level = level;
        this.character_class = character_class;
        this.race = race;
        this.subrace = subrace;
        this.age = age;
        this.personality_traits = personality_traits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.background = background;
        this.other_notes_descriptors = other_notes_descriptors;
        this.important = important;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
