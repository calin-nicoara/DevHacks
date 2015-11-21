package com.filthy.gnomes.entities;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Transactional
@Entity
@Table(name = "MEETING")
public class Meeting {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEETING_SEQ_GEN")
    @SequenceGenerator(name = "MEETING_SEQ_GEN", sequenceName = "MEETING_ID_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    @Column(name = "CODE")
    private String code;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @Column(name = "TIME_END")
    private Date timeEnd;

    @Column(name = "TIME_BEGIN")
    private Date timeBegin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Meeting(Employee employee, String code, Room room, Date timeEnd, Date timeBegin) {
        this.employee = employee;
        this.code = code;
        this.room = room;
        this.timeEnd = timeEnd;
        this.timeBegin = timeBegin;
    }

    public Meeting(){

    }
}
