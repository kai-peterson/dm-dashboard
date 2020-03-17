package com.example.dmdashboard.data;

import lombok.Data;

import java.util.List;

@Data
public class CharacterClassData {

    private String name;
    private String url;
    private List<SubclassData> subclasses;

    public CharacterClassData(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
