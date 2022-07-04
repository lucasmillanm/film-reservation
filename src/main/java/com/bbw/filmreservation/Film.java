package com.bbw.filmreservation;

public class Film {
    private String filmName;
    private String length;
    private String language;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Film(String filmName, String length, String language) {
        this.filmName = filmName;
        this.length = length;
        this.language = language;
    }
}
