package org.lessons.java.bestoftheyear.controller;

import org.lessons.java.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songs(Model model) {
        List<Song> songs = new ArrayList<>();
        for (Song song : getBestSongs()) {
            songs.add(song);
        }
        model.addAttribute("songs", songs);
        return "songs/songs";
    }

    @GetMapping("/{id}")
    public String songShow (@PathVariable int id, Model model) {
        Song selectedSong = null;
        for(Song song: getBestSongs()){
            if(song.getId() == id){
                selectedSong = song;
            }
        }
        model.addAttribute("song", selectedSong);
        return "songs/show";
    }

    // -----------------------------------------------------------------

    private List<Song> getBestSongs() {
        List<Song> bestSongs = new ArrayList<>();
        bestSongs.add(new Song(1, "Wonderwall"));
        bestSongs.add(new Song(2, "Kill the director"));
        bestSongs.add(new Song(3, "I bet you look good on the dancefloor"));
        bestSongs.add(new Song(4, "Last nite"));
        bestSongs.add(new Song(5, "Basketcase"));
        return bestSongs;
    }
}
