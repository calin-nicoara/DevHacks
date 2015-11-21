package com.filthy.gnomes;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({ "com.filthy.gnomes.dao"})
public class ServiceConfig {

    }
