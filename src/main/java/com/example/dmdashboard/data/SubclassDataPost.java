package com.example.dmdashboard.data;

import lombok.Data;

import java.util.List;

@Data
public class SubclassDataPost {

    private String index;
    private String name;
    private String subclassFlavor;
    private String description;
    private String url;
    private String className;
    private List<PrerequisiteDataPost> prerequisiteDataPosts;

}
