import helperclasses.GenderPerson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipve on 17/02/2016.
 */
public class Actor extends Person {

    private List<Movie> moviesPlayedIn;

    public Actor(String name, String familyName, int age, GenderPerson gender){
        super(null,null,0,GenderPerson.MALE);
        this.moviesPlayedIn = new ArrayList<Movie> (  );
    }

    public List<Movie> getMoviesPlayedIn() {
        return moviesPlayedIn;
    }

    public void setMoviesPlayedIn( List<Movie> moviesPlayedIn ) {
        this.moviesPlayedIn = moviesPlayedIn;
    }

    public void addMoviePlayedIn(Movie movie)
    {
        List<Movie> movies = getMoviesPlayedIn ();
        movies.add ( movie );
        setMoviesPlayedIn (movies);
    }





}
