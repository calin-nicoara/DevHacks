package com.filthy.gnomes.tests;

import com.filthy.gnomes.ServiceConfig;
import com.filthy.gnomes.dao.CompanyDAO;
import com.filthy.gnomes.dao.MeetingDAO;
import com.filthy.gnomes.dao.RoomDAO;
import com.filthy.gnomes.dao.VisitorDAO;
import com.filthy.gnomes.entities.Company;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceConfig.class)
@Transactional
public class Test {

    @Autowired
    CompanyDAO companyDAO;

    @org.junit.Test
    public void testCompanyDAO() {

        companyDAO.save(new Company("titi"));
        System.out.println(companyDAO.findOneByName("titi"));

    }
}
