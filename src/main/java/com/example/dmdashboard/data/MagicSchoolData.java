package com.example.dmdashboard.data;

import lombok.Data;

@Data
public class MagicSchoolData {

    private String index;
    private String name;
    private String description;
    private String url;

    public MagicSchoolData() {};

    public MagicSchoolData(String index, String name, String description, String url) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.url = url;
    }
}
