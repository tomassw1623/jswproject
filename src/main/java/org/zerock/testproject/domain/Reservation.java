package org.zerock.testproject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // 예약자 정보 식별
    private String reserv;  // 예약정보
    private String rsCeo;   // 사장 정보
    private String rsCus;   // 고객 정보

    public Reservation() {    // 기본 생성자

    }

    // 생성자
    public Reservation(String reserv, String rsCeo, String rsCus) {
        this.reserv = reserv;
        this.rsCeo = rsCeo;
        this.rsCus = rsCus;
    }

    // Getter 및 Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReserv() {
        return reserv;
    }

    public void setReserv(String reserv) {
        this.reserv = reserv;
    }

    public String getRsCeo() {
        return rsCeo;
    }

    public void setRsCeo(String rsCeo) {
        this.rsCeo = rsCeo;
    }

    public String getRsCus() {
        return rsCus;
    }

    public void setRsCus(String rsCus) {
        this.rsCus = rsCus;
    }
}



