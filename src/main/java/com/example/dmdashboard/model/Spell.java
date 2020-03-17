package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "spells")
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "index")
    private String index;
    @Column(name = "name")
    private String name;
    @Column(name = "description", columnDefinition = "varchar(2500)")
    private String description;
    @Column(name = "higher_level", columnDefinition = "varchar(2500)")
    private String higherLevel;
    @Column(name = "level")
    private int level;
    @Column(name = "range")
    private String range;
    @Column(name = "components")
    private String components;
    @Column(name = "material")
    private String material;
    @Column(name = "ritual")
    private boolean ritual;
    @Column(name = "duration")
    private String duration;
    @Column(name = "concentration")
    private boolean concentration;
    @Column(name = "casting_time")
    private String castingTime;
    @ManyToOne
    @JoinColumn(name = "magic_school_id")
    private MagicSchool magicSchool;
    @ManyToMany
    private List<CharacterClass> characterClasses;
    @ManyToMany
    List<Npc> npc;

}
