package com.filthy.gnomes.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MEETING")
public class Meeting {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEETING_SEQ_GEN")
    @SequenceGenerator(name = "MEETING_SEQ_GEN", sequenceName = "MEETING_ID_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "EMPLOYEE")
    private String employee;

    @ManyToOne
    @JoinColumn(name = "CODE")
    private User code;

    @ManyToOne
    @JoinColumn(name = "LOCATION")
    private Room location;

    @Column(name = "TIME_END")
    private LocalDateTime timeEnd;

    @Column(name = "TIME_BEGIN")
    private LocalDateTime timeBegin;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public User getCode() {
        return code;
    }

    public void setCode(User code) {
        this.code = code;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public LocalDateTime getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalDateTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Meeting(String employee, User code, Room location, LocalDateTime timeEnd, LocalDateTime timeBegin, Company company) {
        this.employee = employee;
        this.code = code;
        this.location = location;
        this.timeEnd = timeEnd;
        this.timeBegin = timeBegin;
        this.company = company;
    }

    public Meeting() {
    }
}
