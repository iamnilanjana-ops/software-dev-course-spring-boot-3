package com.example.springBoot2.controllers;

import com.example.springBoot2.models.Album;
import com.example.springBoot2.repositories.AlbumRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping
    public Iterable<Album> getAlbums() {
        return albumRepository.findAll();
    }

    @PostMapping
    public Album addAlbum(@RequestBody Album album) {
        return albumRepository.save(album);
    }
}