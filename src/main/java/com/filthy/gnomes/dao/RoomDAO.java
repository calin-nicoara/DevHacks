package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Repository
public interface RoomDAO extends JpaRepository<Room, Long> {
}
