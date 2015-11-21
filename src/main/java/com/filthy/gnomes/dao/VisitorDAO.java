package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public interface VisitorDAO extends JpaRepository<Visitor, Long> {
}
