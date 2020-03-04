package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "proficiencies")
public class Proficiencies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "npc_id")
    private int npc_id;
    @Column(name = "strength")
    private boolean strength;
    @Column(name = "dexterity")
    private boolean dexterity;
    @Column(name = "constitution")
    private boolean constitution;
    @Column(name = "intelligence")
    private boolean intelligence;
    @Column(name = "wisdom")
    private boolean wisdom;
    @Column(name = "charisma")
    private boolean charisma;
    @Column(name = "acrobatics")
    private boolean acrobatics;
    @Column(name = "animal_handling")
    private boolean animal_handling;
    @Column(name = "arcana")
    private boolean arcana;
    @Column(name = "athletics")
    private boolean athletics;
    @Column(name = "deception")
    private boolean deception;
    @Column(name = "history")
    private boolean history;
    @Column(name = "insight")
    private boolean insight;
    @Column(name = "intimidation")
    private boolean intimidation;
    @Column(name = "investigation")
    private boolean investigation;
    @Column(name = "medicine")
    private boolean medicine;
    @Column(name = "nature")
    private boolean nature;
    @Column(name = "perception")
    private boolean perception;
    @Column(name = "performance")
    private boolean performance;
    @Column(name = "persuasion")
    private boolean persuasion;
    @Column(name = "religion")
    private boolean religion;
    @Column(name = "sleight_of_hand")
    private boolean sleight_of_hand;
    @Column(name = "stealth")
    private boolean stealth;
    @Column(name = "survival")
    private boolean survival;

    public Proficiencies() {}

    public Proficiencies(Long id, int npc_id, boolean strength, boolean dexterity, boolean constitution, boolean intelligence, boolean wisdom, boolean charisma, boolean acrobatics, boolean animal_handling, boolean arcana, boolean athletics, boolean deception, boolean history, boolean insight, boolean intimidation, boolean investigation, boolean medicine, boolean nature, boolean perception, boolean performance, boolean persuasion, boolean religion, boolean sleight_of_hand, boolean stealth, boolean survival) {
        this.id = id;
        this.npc_id = npc_id;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.acrobatics = acrobatics;
        this.animal_handling = animal_handling;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.history = history;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.performance = performance;
        this.persuasion = persuasion;
        this.religion = religion;
        this.sleight_of_hand = sleight_of_hand;
        this.stealth = stealth;
        this.survival = survival;
    }

}
