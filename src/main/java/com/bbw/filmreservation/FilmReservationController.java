package com.bbw.filmreservation;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class FilmReservationController {
    static Logger log = Logger.getLogger("FilmReservationController");

    @GetMapping("/")
    public String homeForm(Model model) {
        model.addAttribute("reservation", new FilmReservationModel());
        return "index";
    }

    @GetMapping("/reservation")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new FilmReservationModel());
        return "reservation";
    }

    @PostMapping("/reservation")
    public String checkReservationInfo(@ModelAttribute @Valid FilmReservationModel reservation, BindingResult bindingResult, Model model) {
        log.info("check person info/post");
        model.addAttribute("reservation", reservation);
        if (bindingResult.hasErrors()) {
            return "reservation";
        }
        return "response";
    }
}
