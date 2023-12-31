package com.techelevator.dao;

import com.techelevator.model.Genre;

import java.util.List;

public interface GenreDao {

    List<Genre> getAllGenres();
    Genre getGenreById(int id);

}
