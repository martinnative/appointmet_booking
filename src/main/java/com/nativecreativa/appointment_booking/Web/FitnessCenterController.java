package com.nativecreativa.appointment_booking.Web;

import com.nativecreativa.appointment_booking.Service.Appointment_Service;
import com.nativecreativa.appointment_booking.Service.FitnessCenter_Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fitness-centers")
public class FitnessCenterController {
    private final Appointment_Service appointment_service;
    private final FitnessCenter_Service fitnessCenterService;

    public FitnessCenterController(Appointment_Service appointment_service, FitnessCenter_Service fitnessCenterService) {
        this.appointment_service = appointment_service;
        this.fitnessCenterService = fitnessCenterService;
    }
    @GetMapping
    public String getFitenssCenters(){return "blog";}
}
