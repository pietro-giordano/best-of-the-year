package org.lessons.java.bestoftheyear.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Song {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String title;

    public Song(String title) {
        this.id = count.incrementAndGet();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
