package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Movie;
import domain.Actor;

/**
 * Created by filip on 18/02/2016.
 */
public class VideoBeheer {

    private List<Movie> movies;

    public VideoBeheer() {
        this.movies = new ArrayList<Movie>();
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