package com.example.dmdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "spellsss_prerequisites")
public class SpellsPrerequisitesJunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "spells_id")
    private long spellsId;
    @Column(name = "prerequisites_id")
    private long prerequisitesId;

    public SpellsPrerequisitesJunction() {}

    public SpellsPrerequisitesJunction(long spellsId, long prerequisitesId) {
        this.spellsId = spellsId;
        this.prerequisitesId = prerequisitesId;
    }

}
