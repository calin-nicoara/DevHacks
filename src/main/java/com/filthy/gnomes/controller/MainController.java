package com.filthy.gnomes.controller;

import com.filthy.gnomes.dao.*;
import com.filthy.gnomes.dto.GreetingDTO;
import com.filthy.gnomes.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private VisitorDAO visitorDAO;

    @RequestMapping(value= "/addMeeting", method = RequestMethod.POST)
    public @ResponseBody String addMeeting(
            @RequestParam String timeBegin,
            @RequestParam String timeEnd,
            @RequestParam String visitorName,
            @RequestParam String visitorEmail,
            @RequestParam String visitorTelefon,
            @RequestParam String roomId,
            @RequestParam String employeeId
    ) {

        Room room = roomDAO.findOneById(Long.parseLong(roomId));
        Employee employee = employeeDAO.findOneById(Long.parseLong(employeeId));

        Visitor visitor = new Visitor();
        visitor.setName(visitorName);
        visitor.setEmail(visitorEmail);
        visitor.setPhone(visitorTelefon);

        Visitor visitorSaved = visitorDAO.saveAndFlush(visitor);
        Meeting meeting = new Meeting(employee, visitor, "111122", room, new Date(Long.parseLong(timeEnd)),
                                                                         new Date(Long.parseLong(timeBegin)));

        meetingDAO.saveAndFlush(meeting);


        return "";
    }

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
    public String checkUserCredentials(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password) {
        try{
            Employee employee = employeeDAO.findOneByUsername(username);
            if(employee==null || !employee.getPassword().equals(password)){
                return "{\"result\": \"rau\"}";
            }else{
                return "{\"result\": \"bine\", \"employeeId\":\""+ employee.getId() +"\"}";
            }
        }catch(Exception e){
            return "{\"result\": \"rau\"}";
        }
    }

    @RequestMapping(value= "/meetings/findByEmployee/{id}", method = RequestMethod.GET)
    public List<Meeting> getMeetingsByEmployee(@PathVariable long id) {
        Employee employee = employeeDAO.findOne(id);
        List<Meeting> meetings =  meetingDAO.findByEmployee(employee)
                .stream()
                .filter(meeting -> meeting.getTimeEnd().getTime() < new Date().getTime())
                .collect(Collectors.toList());
        return meetings;
    }


}
