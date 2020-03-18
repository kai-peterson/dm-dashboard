package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "subclasses")
public class Subclass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = 14;
    @Column(name = "index")
    private String index;
    @Column(name = "name")
    private String name;
    @Column(name = "subclass_flavor")
    private String subclassFlavor;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @OneToMany
    @JoinColumn(name = "subclass_id")
    private List<Spells> spells;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_class_id")
    private CharacterClass characterClass;

    public Subclass() {};

    public Subclass(String index, String name, String subclassFlavor, String description, String url, CharacterClass characterClass) {
        this.index = index;
        this.name = name;
        this.subclassFlavor = subclassFlavor;
        this.description = description;
        this.url = url;
        this.characterClass = characterClass;
    }

}
