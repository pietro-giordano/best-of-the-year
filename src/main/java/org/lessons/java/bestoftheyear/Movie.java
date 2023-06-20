package org.lessons.java.bestoftheyear;

import java.util.concurrent.atomic.AtomicInteger;

public class Movie {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String title;

    public Movie(String title) {
        this.id = count.incrementAndGet();
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
