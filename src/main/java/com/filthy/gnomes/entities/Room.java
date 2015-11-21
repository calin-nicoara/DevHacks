package com.filthy.gnomes.entities;

import javax.persistence.*;

/**
 * Created by Calin on 11/21/2015.
 */
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROOM_SEQ_GEN")
    @SequenceGenerator(name = "ROOM_SEQ_GEN", sequenceName = "ROOM_ID_SEQ", allocationSize = 1)
    private long id;

    @ManyToOne
    @JoinColumn(name ="COMPANY_ID")
    private Company company;

    private String name;

    private String details;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public Room(String name, String details, Company company) {
        this.name = name;
        this.details = details;
        this.company = company;
    }

    public Room() {
    }
}