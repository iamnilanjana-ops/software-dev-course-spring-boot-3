package com.example.springBoot2.repositories;

import com.example.springBoot2.models.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {
}