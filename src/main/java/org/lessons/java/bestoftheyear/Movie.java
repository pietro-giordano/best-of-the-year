package org.lessons.java.bestoftheyear;

public class Movie {
    private int id = 0;
    private String title;

    public Movie(String title) {
        this.id = id++;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
