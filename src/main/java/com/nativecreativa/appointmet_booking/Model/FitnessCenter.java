package com.nativecreativa.appointmet_booking.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FitnessCenter {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;
    private String description;
    private String location;
    private String address;

    @OneToMany
    private List<Appointment> appointmentList;
}
