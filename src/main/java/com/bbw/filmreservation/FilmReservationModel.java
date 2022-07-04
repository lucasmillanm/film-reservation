package com.bbw.filmreservation;

import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

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

    @NotNull
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
    private String phoneNr;

    @Min(12)
    private int age;

    @NotNull
    private List<Film> movieList = new ArrayList<>();

    public FilmReservationModel() {
        movieList.add(new Film("Batman", "200 min", "English"));
        movieList.add(new Film("Minions", "150 min", "English"));
        movieList.add(new Film("Maze Runner", "122 min", "English"));
        movieList.add(new Film("The Northman", "137 min", "English"));
        movieList.add(new Film("Top Gun: Maverick", "133 min", "English"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Film> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Film> movieList) {
        this.movieList = movieList;
    }
}
