package org.lessons.java.bestoftheyear.controller;

import org.lessons.java.bestoftheyear.Movie;
import org.lessons.java.bestoftheyear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "Pietro");
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        String moviesTitle = "";
        for (Movie movie : getBestMovies()) {
            moviesTitle += movie.getTitle();
        }
        model.addAttribute("moviesTitle", moviesTitle);
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        String songsTitle = "";
        for (Song song : getBestSongs()) {
            songsTitle += song.getTitle() + ", ";
        }
        model.addAttribute("songsTitle", songsTitle);
        return "songs";
    }

    private List<Movie> getBestMovies() {
        List<Movie> bestMovies = new ArrayList<>();
        bestMovies.add(new Movie("Everything everywhere all at once"));
        bestMovies.add(new Movie("Fight club"));
        bestMovies.add(new Movie("Snatch"));
        bestMovies.add(new Movie("Matrix"));
        return bestMovies;
    }

    private List<Song> getBestSongs() {
        List<Song> bestSongs = new ArrayList<>();
        bestSongs.add(new Song("Wonderwall"));
        bestSongs.add(new Song("Kill the director"));
        bestSongs.add(new Song("I bet you look good on the dancefloor"));
        bestSongs.add(new Song("Last nite"));
        return bestSongs;
    }
}
