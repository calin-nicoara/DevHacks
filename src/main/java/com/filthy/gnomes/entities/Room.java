package com.filthy.gnomes.entities;

import javax.persistence.*;

/**
 * Created by Calin on 11/21/2015.
 */
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROOM_SEQ_GEN")
    @SequenceGenerator(name = "ROOM_SEQ_GEN", sequenceName = "ROOM_ID_SEQ", allocationSize = 1)
    long id;

    String name;
    String details;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (name != null ? !name.equals(room.name) : room.name != null) return false;
        return !(details != null ? !details.equals(room.details) : room.details != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        return result;
    }

    public Room(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public Room() {
    }
}