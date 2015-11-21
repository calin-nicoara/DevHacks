package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Company;
import com.filthy.gnomes.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Repository
public interface RoomDAO extends JpaRepository<Room, Long> {

    Room findOneById(Long id);

    List<Room> findByCompany(Company company);
 }
