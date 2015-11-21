package com.filthy.gnomes.entities;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ_GEN")
    @SequenceGenerator(name = "EMPLOYEE_SEQ_GEN", sequenceName = "EMPLOYEE_ID_SEQ", allocationSize = 1)
    Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    private String username;

    private String password;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(String name, String email, Company company, String username, String password) {
        this.name = name;
        this.email = email;
        this.company = company;
        this.username = username;
        this.password = password;
    }

    public Employee() {
    }
}
