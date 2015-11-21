package com.filthy.gnomes.entities;

import javax.persistence.*;

/**
 * Created by Calin on 11/21/2015.
 */
@Entity
@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="COMPANY_SEQ_GEN")
    @SequenceGenerator(name = "COMPANY_SEQ_GEN", sequenceName = "COMPANY_ID_SEQ", allocationSize = 1)
    Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }
}
