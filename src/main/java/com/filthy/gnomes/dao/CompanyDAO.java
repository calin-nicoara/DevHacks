package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tyzmo on 11/21g/2015.
 */
@Repository
public interface CompanyDAO extends JpaRepository<Company, Long>{

    Company findOneByName(String name);

    Company findOneById(Long id);

}
