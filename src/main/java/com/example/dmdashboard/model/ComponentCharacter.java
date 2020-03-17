package com.example.dmdashboard.model;

import lombok.Data;

@Data
public class ComponentCharacter {

    private char componentType;

    public ComponentCharacter() {};

    public ComponentCharacter(char componentType) {
        this.componentType = componentType;
    }

}
