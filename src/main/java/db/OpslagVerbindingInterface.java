package db;

import domain.Actor;
import domain.Movie;
import helperclasses.MovieGenre;

import java.util.List;

/**
 * Created by filip on 18/02/2016.
 */
public interface OpslagVerbindingInterface {

    /**
     * CRUD ==> READ
     *
     */

    /**
     *
     * @return een lijst van alle films in de collectie
     */
    public List<Movie> getAllMovies();

    /**
     *
     * @param movie
     * @return
     */
    public List<Actor> getAllActorsFromOneMovie(Movie movie);

    /**
     *
     * @param genre
     * @return
     */
    public List<Movie> getAllMoviesFromGenre(MovieGenre genre);

    /**
     *
     * @param movieGenres
     * @return
     */
    public List<Movie> getAllMoviesFromMultipleGenres(List<MovieGenre> movieGenres);


    public List<Actor> getAllMaleActors();

    public List<Actor> getAllFemaleActors();


    /**
     * CRUD ==> create
     */

    /**
     * Voegt een acteur toe aan een film waarin hij meegespeeld heeft.
     * @param actor
     * @param movie
     */
    public void addActor(Actor actor, Movie movie);

    /**
     * Voegt een actor toe aan de collectie
     * @param actor
     */
    public void addActor(Actor actor);

    /**
     * Voegt een film toe aan de collectie
     * @param movie
     */
    public void addMovie(Movie movie);

    /**
     * CRUD ==> update
     */

    /**
     *
     * @param movie
     */

    public void updateMovie(Movie movie);

    public void updateActor(Actor actor, Actor oldActor);

/**
 * CRUD ==> delete
 */



}
