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
    private long npc_id;
    @Column(name = "health")
    private int health;
    @Column(name = "armor_class")
    private int armor_class;
    @Column(name = "speed")
    private int speed;
    @Column(name = "proficiency")
    private int proficiency_bonus;
    @Column(name = "strength")
    private int strength;
    @Column(name = "dexterity")
    private int dexterity;
    @Column(name = "constitution")
    private int constitution;
    @Column(name = "intelligence")
    private int intelligence;
    @Column(name = "wisdom")
    private int wisdom;
    @Column(name = "charisma")
    private int charisma;

    public Stats() {}

    public Stats(long npc_id, int health, int armor_class, int speed, int proficiency_bonus, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.npc_id = npc_id;
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
