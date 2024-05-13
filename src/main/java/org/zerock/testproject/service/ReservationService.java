package org.zerock.testproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.testproject.domain.CustomerReservation;
import org.zerock.testproject.repository.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public void createReservation(CustomerReservation reservation) {
        reservationRepository.save(reservation);
    }

}