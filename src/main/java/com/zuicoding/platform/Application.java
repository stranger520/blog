package com.zuicoding.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:spring-velocity.xml"})
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run(Application.class,args);
    }
}
