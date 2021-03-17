package com.example;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class MusicController {

    private final MusicApi musicApi;

    @GetMapping("/api/songs")
    public List<Song> getAllSongs() {
        return musicApi.getAllAvailableSongs();
    }

}
