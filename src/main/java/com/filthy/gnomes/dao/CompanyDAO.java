package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tyzmo on 11/21g/2015.
 */
public interface CompanyDAO extends JpaRepository<Company, Long>{
}
