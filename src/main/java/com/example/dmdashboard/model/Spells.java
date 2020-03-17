package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "spellsss")
public class Spells {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToMany
    @JoinColumn(name = "spellsss_id")
    private List<Prerequisite> prerequisites;
    @ManyToOne
    @JoinColumn(name = "spell_id")
    private Spell spell;
    @ManyToOne
    @JoinColumn(name = "subclass_id")
    private Subclass subclass;

    public Spells() {}

    public Spells(List<Prerequisite> prerequisites, Spell spell) {
        this.prerequisites = prerequisites;
        this.spell = spell;
    }

}
