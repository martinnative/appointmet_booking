package com.nativecreativa.appointmet_booking.Service;

import com.nativecreativa.appointmet_booking.Model.Appointment;
import com.nativecreativa.appointmet_booking.Model.FitnessCenter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public interface Appointment_Service {

    Optional <Appointment> findById(Long id);
    List<Appointment> listAll();
    Appointment addNew(Appointment appointment);
    void delete(Long id);
    Optional <Appointment> update(Long Id,LocalDateTime dateTime, FitnessCenter fitnessCenter);


}
