package org.zerock.testproject.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.testproject.domain.Reservation;
import org.zerock.testproject.dto.ReservationDTO;
import org.zerock.testproject.repository.ReservationRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepository reservationRepository;

    @Override   // 저장
    public Long reservation(ReservationDTO reservationDTO) {
        Reservation reservation = reservationDTO.toreservatino();
        reservationRepository.save(reservation);
        return null;
    }
}
