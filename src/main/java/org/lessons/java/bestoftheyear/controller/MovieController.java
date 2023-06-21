package org.lessons.java.bestoftheyear.controller;

import org.lessons.java.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String movies(Model model) {
        List<Movie> movies = new ArrayList<>();
        for (Movie movie : getBestMovies()) {
            movies.add(movie);
        }
        model.addAttribute("movies", movies);
        return "movies/movies";
    }

    @GetMapping("/{id}")
    public String movieShow (@PathVariable int id, Model model) {
        Movie selectedMovie = null;
        for(Movie movie: getBestMovies()){
            if(movie.getId() == id){
                selectedMovie = movie;
            }
        }
        model.addAttribute("movie", selectedMovie);
        return "movies/show";
    }

    // -----------------------------------------------------------------

    public List<Movie> getBestMovies() {
        List<Movie> bestMovies = new ArrayList<>();
        bestMovies.add(new Movie(1, "Everything everywhere all at once"));
        bestMovies.add(new Movie(2, "Fight club"));
        bestMovies.add(new Movie(3, "Snatch"));
        bestMovies.add(new Movie(4, "Matrix"));
        bestMovies.add(new Movie(5, "Forrest Gump"));
        return bestMovies;
    }
}
