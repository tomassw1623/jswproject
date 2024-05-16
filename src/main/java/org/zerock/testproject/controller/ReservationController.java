package org.zerock.testproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.zerock.testproject.dto.ReservationDTO;
import org.zerock.testproject.service.ReservationService;

@Controller
@RequiredArgsConstructor
@Log4j2
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservation")
    public String showReservationForm(Model model) {
        model.addAttribute("reservationDTO", new ReservationDTO());
        return "reservation";
    }

    @PostMapping("/reservation")
    public String handleReservation(@ModelAttribute ReservationDTO reservationDTO, Model model) {
        reservationService.(reservationDTO);
        model.addAttribute("message", "예약이 완료되었습니다.");
        return "reservation";
    }

    @
}