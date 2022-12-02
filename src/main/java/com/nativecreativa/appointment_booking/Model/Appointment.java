package com.nativecreativa.appointment_booking.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id ;
    private LocalDateTime dateTime;
    @OneToOne
    private FitnessCenter fitnessCenter;







}
