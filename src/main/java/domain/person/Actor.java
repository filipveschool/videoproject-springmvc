package domain.person;

import domain.Movie;
import domain.person.Age;
import domain.person.Person;
import domain.person.GenderPerson;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipve on 17/02/2016.
 */
public class Actor extends Person {

    private List<Movie> moviesPlayedIn;

    public Actor(String name, String familyName,
                 Age dateOfBirth, GenderPerson gender) {
        super(name,familyName,dateOfBirth,gender);
        this.moviesPlayedIn = new ArrayList<Movie>();
    }

    public List<Movie> getMoviesPlayedIn() {
        return moviesPlayedIn;
    }

    public void setMoviesPlayedIn(List<Movie> moviesPlayedIn) {
        this.moviesPlayedIn = moviesPlayedIn;
    }

    public void addMoviePlayedIn(Movie movie) {
        List<Movie> movies = getMoviesPlayedIn();
        movies.add(movie);
        setMoviesPlayedIn(movies);
    }


}
