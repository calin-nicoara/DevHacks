package com.filthy.gnomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Import({ ServiceConfig.class})
public class DevHacksApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevHacksApplication.class, args);
    }
}
