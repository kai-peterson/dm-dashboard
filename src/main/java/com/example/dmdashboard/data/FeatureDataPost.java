package com.example.dmdashboard.data;

import lombok.Data;

@Data
public class FeatureDataPost {

    private String index;
    private String name;
    private String description;
    private int level;
    private String url;
    private String className;
    private String subclassName;

    public FeatureDataPost() {}

    public FeatureDataPost(String index, String name, String description, int level, String url, String className) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.level = level;
        this.url = url;
        this.className = className;
    }

    public FeatureDataPost(String index, String name, String description, int level, String url, String className, String subclassName) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.level = level;
        this.url = url;
        this.className = className;
        this.subclassName = subclassName;
    }

}
