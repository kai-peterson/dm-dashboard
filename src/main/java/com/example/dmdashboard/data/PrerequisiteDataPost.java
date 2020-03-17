package com.example.dmdashboard.data;

import lombok.Data;

import java.util.List;

@Data
public class PrerequisiteDataPost {

    private List<String> prerequisiteUrls;
    private String spellName;

    public PrerequisiteDataPost() {}

    public PrerequisiteDataPost(List<String> prerequisiteUrl, String spellName) {
        this.prerequisiteUrls = prerequisiteUrls;
        this.spellName = spellName;
    }
}
