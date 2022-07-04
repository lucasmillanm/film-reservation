package com.bbw.filmreservation;

import jakarta.validation.constraints.*;

public class FilmReservationModel {
    @NotNull
    @Size(min = 1, max = 16)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 16)
    private String lastName;

    @NotNull
    @Email
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
    private String telNummer;

    @Min(12)
    private int alter;

    private boolean withExtra;
}
