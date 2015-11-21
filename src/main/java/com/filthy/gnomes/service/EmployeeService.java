package com.filthy.gnomes.service;

import com.filthy.gnomes.entities.Company;
import com.filthy.gnomes.entities.Room;

import java.util.Date;
import java.util.List;

public interface EmployeeService {

    List<Room> getAvailableRooms(Date start, Date end, Company company);
}
