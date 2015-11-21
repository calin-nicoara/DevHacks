package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Employee;
import com.filthy.gnomes.entities.Meeting;
import com.filthy.gnomes.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@RepositoryRestResource(collectionResourceRel = "meetings", path = "meetings")
public interface MeetingDAO extends JpaRepository<Meeting, Long>{

    Meeting findOneById(Long id);

    Meeting findOneByCode(String code);

    List<Meeting> findByEmployee(Employee employee);

    List<Meeting> findByRoom(Room room);
}
