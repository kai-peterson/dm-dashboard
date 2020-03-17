package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "magic_schools")
public class MagicSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "index")
    private String index;
    @Column(name = "name")
    private String name;
    @Column(name = "description", columnDefinition = "varchar(1500)")
    private String description;
    @Column(name = "url")
    private String url;


}
