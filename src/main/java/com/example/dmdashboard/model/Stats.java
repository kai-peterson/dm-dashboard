package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "stats")
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "npc_id")
    private long npcId;
    @Column(name = "health")
    private int health;
    @Column(name = "armor_class")
    private int armor_class;
    @Column(name = "speed")
    private int speed;
    @Column(name = "proficiency")
    private int proficiency_bonus;
    @Column(name = "Strength")
    private int strength;
    @Column(name = "Dexterity")
    private int dexterity;
    @Column(name = "Constitution")
    private int constitution;
    @Column(name = "Intelligence")
    private int intelligence;
    @Column(name = "Wisdom")
    private int wisdom;
    @Column(name = "Charisma")
    private int charisma;

    public Stats() {}

    public Stats(long npcId, int health, int armor_class, int speed, int proficiency_bonus, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.npcId = npcId;
        this.health = health;
        this.armor_class = armor_class;
        this.speed = speed;
        this.proficiency_bonus = proficiency_bonus;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

}
