package com.filthy.gnomes.entities;

import javax.persistence.*;

/**
 * Created by Calin on 11/21/2015.
 */
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="COMPANY_SEQ_GEN")
    @SequenceGenerator(name = "COMPANY_SEQ_GEN", sequenceName = "COMPANY_ID_SEQ", allocationSize = 1)
    Long id;

    String name;
    String user;
    String password;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (id != company.id) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        if (user != null ? !user.equals(company.user) : company.user != null) return false;
        return !(password != null ? !password.equals(company.password) : company.password != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
