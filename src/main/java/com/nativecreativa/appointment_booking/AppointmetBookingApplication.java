package com.nativecreativa.appointment_booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nativecreativa.appointment_booking.*")
public class AppointmetBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointmetBookingApplication.class, args);
    }

}
