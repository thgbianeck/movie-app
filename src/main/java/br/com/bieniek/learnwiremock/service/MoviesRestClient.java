package br.com.bieniek.learnwiremock.service;

import br.com.bieniek.learnwiremock.dto.Movie;

import java.util.List;

public interface MoviesRestClient {

    List<Movie> retrieveAllMovies();
    Movie retrieveMovieById(Integer movieId);
    List<Movie> retrieveMovieByName(String movieName);
    List<Movie> retreieveMovieByYear(Integer year);
    Movie addNewMovie(Movie newMovie);
    Movie updateMovie(Integer movieId, Movie movie);
    String deleteMovieById(Integer movieId);
}
