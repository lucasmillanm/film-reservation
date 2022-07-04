package com.bbw.filmreservation;

public class Film {
    private String filmName;
    private String duration;
    private String language;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Film(String filmName, String length, String language) {
        this.filmName = filmName;
        this.duration = length;
        this.language = language;
    }
}
