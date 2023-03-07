package com.shrad.bookmovies.dao;

import com.shrad.bookmovies.dao.model.Movie;
import com.shrad.bookmovies.dao.repository.MovieRepository;
import com.shrad.bookmovies.exceptions.DBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.util.List;

@Component
public class MovieImpl {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final MovieRepository movieRepository;

    public MovieImpl (final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Async
    public void loadMovie(Movie movie) throws DBException {
        try{

        } catch (Exception e){
            logger.error("Exception: {}", e);
            throw new DBException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed in DB Operation", e);
        }
        movieRepository.save(movie);
    }
}
