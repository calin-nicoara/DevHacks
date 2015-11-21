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
    @Column(name = "CODE")
    private User code;

    @ManyToOne
    @Column(name = "LOCATION")
    private Room location;

    @Column(name = "TIME_END")
    private LocalDateTime timeEnd;

    @Column(name = "TIME_BEGIN")
    private LocalDateTime timeBegin;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

}
