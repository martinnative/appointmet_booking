package com.nativecreativa.appointment_booking.Configuration;

import com.nativecreativa.appointment_booking.Model.FitnessCenter;
import com.nativecreativa.appointment_booking.Service.FitnessCenter_Service;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Data_Creation {
    private final FitnessCenter_Service fitnessCenterService;

    public Data_Creation(FitnessCenter_Service fitnessCenterService) {
        this.fitnessCenterService = fitnessCenterService;
    }
    @PostConstruct
    public void DataCreation(){
        this.fitnessCenterService.addNew(new FitnessCenter("Magnus","Centar za borecki sportovi","Skopje","Misko Mihajlovski","075222358"));
        this.fitnessCenterService.addNew(new FitnessCenter("Atleta","Atleta Aerodrom","Skopje","Ruger Boskovic","075222358"));
    }

}
