package org.lessons.java.bestoftheyear;

public class Song {
    private int id = 0;
    private String title;

    public Song(String title) {
        this.id = id++;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
