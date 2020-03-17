package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "features")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "index")
    private String index;
    @Column(name = "name")
    private String name;
    @Column(name = "description", columnDefinition = "varchar(2500)")
    private String description;
    @Column(name = "level")
    private int level;
    @Column(name = "url")
    private String url;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private CharacterClass characterClass;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subclass_id")
    private Subclass subclass;


    public Feature() {}

    public Feature(String name, String index, String description, int level, String url, CharacterClass characterClass) {
        this.name = name;
        this.index = index;
        this.description = description;
        this.level = level;
        this.url = url;
        this.characterClass = characterClass;
    }
    
    public Feature(String name, String index, String description, int level, String url, CharacterClass characterClass, Subclass subclass) {
        this.name = name;
        this.index = index;
        this.description = description;
        this.level = level;
        this.url = url;
        this.characterClass = characterClass;
        this.subclass = subclass;
    }

}
