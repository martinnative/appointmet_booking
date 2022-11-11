package com.nativecreativa.appointmet_booking.Repository;

import com.nativecreativa.appointmet_booking.Model.FitnessCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessCenter_Repository extends JpaRepository<Long, FitnessCenter> {
}
