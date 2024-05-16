package org.zerock.testproject.service;

import org.springframework.stereotype.Service;
import org.zerock.testproject.dto.ReservationDTO;

@Service
public interface ReservationService {

    Long reservation (ReservationDTO reservationDTO);
}