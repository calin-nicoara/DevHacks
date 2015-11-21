package com.filthy.gnomes.controller;

import com.filthy.gnomes.dao.EmployeeDAO;
import com.filthy.gnomes.dao.MeetingDAO;
import com.filthy.gnomes.dao.RoomDAO;
import com.filthy.gnomes.dto.GreetingDTO;
import com.filthy.gnomes.entities.Employee;
import com.filthy.gnomes.entities.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@RestController
public class MainController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private MeetingDAO meetingDAO;

    @Autowired
    private RoomDAO roomDAO;

    @RequestMapping(value = "/checkVisitorCode", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public GreetingDTO checkVisitorCode(@RequestParam(value = "code", required = true) String code) {
        try{
            Meeting meeting = meetingDAO.findOneByCode(code);
            if(meeting!=null){
                return new GreetingDTO(meeting.getEmployee().getName(), meeting.getRoom().getName(), meeting.getRoom().getDetails());
            }else{
                return new GreetingDTO();
            }
        }catch(Exception e){
            return new GreetingDTO();
        }
    }

    @RequestMapping(value = "/checkCredentials", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Boolean checkUserCredentials(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password) {
        try{
            Employee employee = employeeDAO.findOneByUsername(username);
            if(employee==null || !employee.getPassword().equals(password)){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            return false;
        }
    }
}
