package com.shrad.bookmovies.api;

import com.shrad.bookmovies.dao.model.Movie;
import com.shrad.bookmovies.dao.model.Theatre;
import com.shrad.bookmovies.service.TheatreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TheatresController {
    private final TheatreService theatreService;


    public TheatresController(final TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/theatres/{movieName}")
    public List<Theatre> getAllTheatresByMovieName(@PathVariable("movieName") String movieName){
        return theatreService.getTheatresByMovieName();
    }

    @GetMapping("/theatres/{theatreName}/getAllMovies")
    public List<Movie> getAllMoviesByTheatreName(@PathVariable("theatreName") String theatreName){
        return theatreService.getAllMoviesByTheatreName();
    }
}
