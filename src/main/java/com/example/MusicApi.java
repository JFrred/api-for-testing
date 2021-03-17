package com.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicApi {

    public List<Song> getAllAvailableSongs() {
        return allSongs();
    }

    private List<Song> allSongs() {
        List<Song> songs =  List.of(
                new Song("TOOL", "Pneuma", 2000),
                new Song("TOOL", "Fear Inoculum", 2000),
                new Song("TOOL", "Schism", 2002),
                new Song("Avatar", "Torn Apart", 2015),
                new Song("Avatar", "Hail The Apocalypse", 2013),
                new Song("Avatar", "The King Wants You", 2014),
                new Song("Avatar", "Let It Burn", 2016),
                new Song("Amorphis", "Shades Of Gray", 2013),
                new Song("Amorphis", "Dead Man's Dream", 2013),
                new Song("Amorphis", "Hopeless Days", 2013)
        );

        return songs;
    }
}
