package com.example.dmdashboard.data;

import lombok.Data;

@Data
public class SpellDataSimple {

    private String name;
    private String url;

    public SpellDataSimple() {}

    public SpellDataSimple(String name, String url) {
        this.name = name;
        this.url = url;
    }

}
