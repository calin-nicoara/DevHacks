package com.filthy.gnomes;

import com.filthy.gnomes.dao.*;
import com.filthy.gnomes.entities.Meeting;
import com.filthy.gnomes.entities.Visitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DevHacksApplication.class)
@WebAppConfiguration
public class DevHacksApplicationTests {

	@Autowired
	private VisitorDAO visitorDAO;
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private RoomDAO roomDAO;
	@Autowired
	private MeetingDAO meetingDAO;
	@Autowired
	private CompanyDAO companyDAO;


	@Test
	public void contextLoads() {


//		LocalDateTime localTime1 = LocalDateTime.of(2014, 5, 29, 18, 41, 16);
//		LocalDateTime localTime2 = LocalDateTime.of(2014, 5, 30, 18, 41, 16);
//		LocalDateTime localTime3 = LocalDateTime.of(2014, 6, 28, 18, 41, 16);
//		LocalDateTime localTime4 = LocalDateTime.of(2014, 6, 30, 18, 41, 16);
//
//		Meeting meeting = new Meeting(employeeDAO.findOneById(-1L),"111111", roomDAO.getOne(-1L), localTime1, localTime2);
//
//		Visitor visitor = new Visitor(meeting, "Virigil Iantu", "virgil.iantu@gmail.com","03243232",  localTime1, localTime2);
//
//		meetingDAO.save(meeting);
//		visitorDAO.save(visitor);
		System.out.println(companyDAO.findOne(-1L).getName());
//		roomDAO.findOne(-1L);
//		employeeDAO.findOne(-1L);
//		meetingDAO.findOne(-3L);

	}

}
