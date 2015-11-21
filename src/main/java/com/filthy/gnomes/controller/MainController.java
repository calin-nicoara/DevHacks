package com.filthy.gnomes.controller;

import com.filthy.gnomes.dao.EmployeeDAO;
import com.filthy.gnomes.dao.MeetingDAO;
import com.filthy.gnomes.dao.VisitorDAO;
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

    @RequestMapping(value = "/checkVisitorCode", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Boolean checkVisitorCode(@RequestParam(value = "code", required = true) String code) {
        try{
            Meeting meeting = meetingDAO.findOneByCode(code);
            if(meeting!=null){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
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
