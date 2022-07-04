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
        model.addAttribute("movieList", new FilmReservationModel().getMovieList());
        return "reservation";
    }

    @PostMapping("/reservation")
    public String checkReservationInfo(@ModelAttribute @Valid FilmReservationModel reservation, BindingResult bindingResult, Model model) {
        log.info("check reservation info/post");
        model.addAttribute("reservation", reservation);
        model.addAttribute("movieList", new FilmReservationModel().getMovieList());
        if (bindingResult.hasErrors()) {
            log.info("has errors");
            return "reservation";
        }
        return "response";
    }
}
