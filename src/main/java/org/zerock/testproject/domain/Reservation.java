package org.zerock.testproject.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "reservation")
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 예약 고유 식별자
    private Long cusId; // 고객 ID
    private Long storeId; // 가게 ID
    private LocalDateTime resDate; // 예약 날짜/시간


    public Reservation(Long id, Long cusId, Long storeId, LocalDateTime resDate) {
        this.id = id;
        this.cusId = cusId;
        this.storeId = storeId;
        this.resDate = resDate;
    }
}