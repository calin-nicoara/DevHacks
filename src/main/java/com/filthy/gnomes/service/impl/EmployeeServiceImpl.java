package com.filthy.gnomes.service.impl;

import com.filthy.gnomes.dao.MeetingDAO;
import com.filthy.gnomes.dao.RoomDAO;
import com.filthy.gnomes.entities.Company;
import com.filthy.gnomes.entities.Meeting;
import com.filthy.gnomes.entities.Room;
import com.filthy.gnomes.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RoomDAO roomDAO;

    @Autowired
    private MeetingDAO meetingDAO;

    @Override
    public List<Room> getAvailableRooms(Date start, Date end, Company company) {

        List<Room> availableRooms = new ArrayList<>();
        List<Room> all = roomDAO.findByCompany(company);

        for (Room room : all) {
            List<Meeting> allMeetings = meetingDAO.findByRoom(room);

            for (Meeting meeting : allMeetings) {
                if ((meeting.getTimeBegin().before(start) && meeting.getTimeEnd().after(start)) || (meeting.getTimeBegin().before(end) && meeting.getTimeEnd().after(end))) {
                    break;
                }
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }
}
