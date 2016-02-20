package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Movie;
import domain.Actor;

/**
 * Created by filip on 18/02/2016.
 *
 * Dit is mijn facade klasse.
 *
 * Hier moeten alle methodes gebruikt worden om te linken met andere klassen.
 *
 *
 */
public class VideoBeheer {

    private List<Movie> movies;
    private List<Actor> actors;

    public VideoBeheer() {
        this.movies = new ArrayList<Movie>();
        this.actors = new ArrayList<Actor>();
    }

    /**
     * Hier komt alles van de klasse Movie
     *
     */

    /**
     * Hier wordt een lijst opgehaald uit de DB klasse.
     * @return een lijst van alle actors die meespelen in 1 film
     */
    public List<Actor> getAllActorsFromMovie(){
return null;
    }

    public List<Movie> generateListOfMoviesAlreadySeen() {

        List<Movie> moviesSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen()) {
                moviesSeen.add(movies.get(i));
            }

        }

        return moviesSeen;
    }

    public List<Movie> generateListOfMoviesNotSeen() {
        List<Movie> moviesNotSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen() == false) {
                moviesNotSeen.add(movies.get(i));
            }
        }

        return moviesNotSeen;
    }

    public List<Movie> getActorfromMovies(Actor actor) {
        return actor.getMoviesPlayedIn();
    }
}