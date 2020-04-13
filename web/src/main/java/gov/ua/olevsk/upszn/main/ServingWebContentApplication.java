package gov.ua.olevsk.upszn.main;

import gov.ua.olevsk.upszn.entity.Accountant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("gov.ua.olevsk.upszn.controller")
@ComponentScan("gov.ua.olevsk.upszn.entity")
@ComponentScan("gov.ua.olevsk.upszn.repo")
@EntityScan(basePackageClasses = Accountant.class)

@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}