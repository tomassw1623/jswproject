package org.zerock.testproject.dto;

public class ReservationDTO {
    private String reserv;
    private String rsCeo;
    private String rsCus;

    // 생성자
    public ReservationDTO() {
        // 기본 생성자
    }

    // Getter 및 Setter
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