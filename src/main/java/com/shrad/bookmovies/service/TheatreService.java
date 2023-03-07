package com.shrad.bookmovies.service;

import com.shrad.bookmovies.dao.model.Movie;
import com.shrad.bookmovies.dao.model.Theatre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {
    public List<Theatre> getTheatresByMovieName() {
        return new ArrayList<Theatre>();
    }

    public List<Movie> getAllMoviesByTheatreName() {
        return new ArrayList<Movie>();
    }
}
