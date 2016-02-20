package db;

import domain.Actor;
import domain.Movie;
import domain.person.Person;
import helperclasses.MovieGenre;

import java.sql.SQLException;
import java.util.*;

/**
 * Created by filip on 18/02/2016.
 */
public class VideoBeheerDbFake implements OpslagVerbindingInterface {

    //TODO interface maken met alleen methodes, en dan de klassen daaraan linken

    //TODO: db klassen opsplitsen voor actors en movies

    //TODO static maken
    Map<Integer, Movie> beheer;

    Map<Integer, Actor> actors;

    public VideoBeheerDbFake() {
        beheer = new HashMap<Integer, Movie>();
        actors = new HashMap<Integer, Actor>();
    }

    public List<Movie> getAllMovies() {
        List<Movie> lijstfilms = new ArrayList<Movie>(beheer.values());
        return lijstfilms;
    }


    public List<Actor> getAllActorsFromOneMovie(Movie movie) {
        return movie.getActors();
    }

    public List<Movie> getAllMoviesFromGenre(MovieGenre genre) {
        List<Movie> movies = new ArrayList<Movie>();
        for (Movie movie : beheer.values()) {

            if (movie.getGenre() == genre) {
                movies.add(movie);
            }

        }
        return movies;
    }


    public List<Movie> getAllMoviesFromMultipleGenres(List<MovieGenre> movieGenres) {
        return null;
    }

    public List<Actor> getAllMaleActors() {
        List<Actor> actors = new ArrayList<Actor>();
        //for(Actor actor : beheer.values()){

        //}

        return actors;
    }

    public List<Actor> getAllFemaleActors() {
        return null;
    }

    public void addActor(Actor Actor, Movie movie) {

        List<Actor> movies = movie.getActors();


    }

    public void addActor(Actor actor) {

    }

    public void addMovie(Movie movie) {

        //rekening houden met unieke variabelen voor remove update
        int maxkey = Collections.max(beheer.keySet());

        beheer.put(maxkey + 1, movie);

    }

    public void updateMovie(Movie movie) {
        beheer.put(movie.getId(), movie);
    }

    public void updateActor(Actor actor, Actor oldActor) {

    }


}
