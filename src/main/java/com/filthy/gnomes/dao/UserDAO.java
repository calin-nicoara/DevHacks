package com.filthy.gnomes.dao;

import com.filthy.gnomes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public interface UserDAO extends JpaRepository<User, Long> {
}
