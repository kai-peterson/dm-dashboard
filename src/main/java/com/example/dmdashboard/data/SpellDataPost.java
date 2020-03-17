package com.example.dmdashboard.data;

import lombok.Data;

import java.util.List;

@Data
public class SpellDataPost {

    private String index;
    private String name;
    private String description;
    private String higherLevel;
    private int level;
    private String range;
    private String components;
    private String material;
    private boolean ritual;
    private String duration;
    private boolean concentration;
    private String castingTime;
    private String magicSchoolName;
    private List<String> classNames;
    private List<String> subclassNames;

    public SpellDataPost(String index, String name, String description, String higherLevel, int level, String range, String components, String material, boolean ritual, String duration, boolean concentration, String castingTime, String magicSchoolName, List<String> classNames) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.higherLevel = higherLevel;
        this.level = level;
        this.range = range;
        this.components = components;
        this.material = material;
        this.ritual = ritual;
        this.duration = duration;
        this.concentration = concentration;
        this.castingTime = castingTime;
        this.magicSchoolName = magicSchoolName;
        this.classNames = classNames;
    }

    public SpellDataPost(String index, String name, String description, String higherLevel, int level, String range, String components, String material, boolean ritual, String duration, boolean concentration, String castingTime, String magicSchoolName, List<String> classNames, List<String> subclassNames) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.higherLevel = higherLevel;
        this.level = level;
        this.range = range;
        this.components = components;
        this.material = material;
        this.ritual = ritual;
        this.duration = duration;
        this.concentration = concentration;
        this.castingTime = castingTime;
        this.magicSchoolName = magicSchoolName;
        this.classNames = classNames;
        this.subclassNames = subclassNames;
    }
}
