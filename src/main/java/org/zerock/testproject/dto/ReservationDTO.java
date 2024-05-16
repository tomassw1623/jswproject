package org.zerock.testproject.dto;

import lombok.*;
import org.zerock.testproject.domain.Reservation;
import org.zerock.testproject.repository.ReservationRepository;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationDTO {
    private Long Id; // 식별자
    private Long cusId; // 고객 ID
    private Long storeId; // 가게 ID
    private LocalDateTime resDate; // 예약 날짜/시간

    public Reservation toreservatino() {
        Reservation reservation = Reservation.builder()
                .cusId(cusId)
                .storeId(storeId)
                .resDate(resDate).build();

        return reservation;
    }
}
