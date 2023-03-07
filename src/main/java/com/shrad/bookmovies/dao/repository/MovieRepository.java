package com.shrad.bookmovies.dao.repository;

import com.shrad.bookmovies.dao.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
