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
    private long npcId;
    @Column(name = "strength")
    private String strength = "none";
    @Column(name = "dexterity")
    private String dexterity = "none";
    @Column(name = "constitution")
    private String constitution = "none";
    @Column(name = "intelligence")
    private String intelligence = "none";
    @Column(name = "wisdom")
    private String wisdom = "none";
    @Column(name = "charisma")
    private String charisma = "none";
    @Column(name = "acrobatics")
    private String acrobatics = "none";
    @Column(name = "animal_handling")
    private String animal_handling = "none";
    @Column(name = "arcana")
    private String arcana = "none";
    @Column(name = "athletics")
    private String athletics = "none";
    @Column(name = "deception")
    private String deception = "none";
    @Column(name = "history")
    private String history = "none";
    @Column(name = "insight")
    private String insight = "none";
    @Column(name = "intimidation")
    private String intimidation = "none";
    @Column(name = "investigation")
    private String investigation = "none";
    @Column(name = "medicine")
    private String medicine = "none";
    @Column(name = "nature")
    private String nature = "none";
    @Column(name = "perception")
    private String perception = "none";
    @Column(name = "performance")
    private String performance = "none";
    @Column(name = "persuasion")
    private String persuasion = "none";
    @Column(name = "religion")
    private String religion = "none";
    @Column(name = "sleight_of_hand")
    private String sleight_of_hand = "none";
    @Column(name = "stealth")
    private String stealth = "none";
    @Column(name = "survival")
    private String survival = "none";

    public Proficiencies() {}

    public Proficiencies(Long id, int npcId, String strength, String dexterity, String constitution, String intelligence, String wisdom, String charisma, String acrobatics, String animal_handling, String arcana, String athletics, String deception, String history, String insight, String intimidation, String investigation, String medicine, String nature, String perception, String performance, String persuasion, String religion, String sleight_of_hand, String stealth, String survival) {
        this.id = id;
        this.npcId = npcId;
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
