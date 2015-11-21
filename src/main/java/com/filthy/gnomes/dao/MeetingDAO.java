package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Repository
public interface MeetingDAO extends JpaRepository<Meeting, Long>{
}
