package com.filthy.gnomes.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Entity
@Table(name = "VISITOR")
public class Visitor {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_GEN")
    @SequenceGenerator(name = "USER_SEQ_GEN", sequenceName = "USER_ID_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEETING_ID")
    private Meeting meeting;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ENTRY_TIME")
    private Date entryTime;

    @Column(name = "EXIT_TIME")
    private Date exitTime;

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Visitor(Meeting meeting, String name, String email, String phone, Date entryTime, Date exitTime) {
        this.meeting = meeting;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public Visitor() {
    }
}