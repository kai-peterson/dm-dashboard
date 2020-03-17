package com.example.dmdashboard.data;

import lombok.Data;

@Data
public class SubclassData {

    private String name;
    private String url;

    public SubclassData(String name, String url) {
        this.name = name;
        this.url = url;
    }

}
