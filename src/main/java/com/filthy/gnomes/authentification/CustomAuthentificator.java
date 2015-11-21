package com.filthy.gnomes.authentification;

import com.filthy.gnomes.dao.EmployeeDAO;
import com.filthy.gnomes.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyzmo on 11/21/2015.
 */
public class CustomAuthentificator implements AuthenticationProvider {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName().trim();
        String password = authentication.getCredentials().toString().trim();

        try {
            Employee validEmployee = employeeDAO.findOneByUsername(username);

            if (validEmployee != null && validEmployee.getPassword().equals(password)) {
                List<GrantedAuthority> grantedAuths = new ArrayList<>();

                return new UsernamePasswordAuthenticationToken(validEmployee, authentication, grantedAuths);
            }
        } catch (Exception e) {
        }

        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
