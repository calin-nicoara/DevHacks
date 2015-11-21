package com.filthy.gnomes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Configuration
@EnableWebSecurity
@ComponentScan({ "com.filthy.gnomes.authentication" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private AuthenticationProvider authenticationProvider;

        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/js/**").antMatchers("/images/**").antMatchers("/css/**").antMatchers("/fonts/**");
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.authenticationProvider(authenticationProvider);
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable().headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN));
            http.authorizeRequests().antMatchers("/loginView.html", "/codeCheck", "/rest/checkVisitorCode.json", "/rest/checkCredentials.json")
                    .permitAll().anyRequest().authenticated().and().formLogin().loginProcessingUrl("/loginView").loginPage("/loginView.html").usernameParameter("username")
                    .passwordParameter("password").defaultSuccessUrl("/newmeet.html").permitAll();
        }
    }

