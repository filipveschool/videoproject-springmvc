import domain.Actor;
import domain.Movie;
import domain.VideoBeheer;
import domain.person.Age;
import domain.person.GenderPerson;
import helperclasses.MovieEvaluation;
import helperclasses.MovieGenre;
import helperclasses.MovieRating;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * Created by filipve on 17/02/2016.
 */
public class MovieTest extends TestCase {

    private String title;
    private String director;
    private int year;
    private MovieGenre genre;
    private MovieRating rating;
    private MovieEvaluation evaluation;
    private boolean seen;
    private VideoBeheer vdb;
    private Movie movie;
    private Actor actor,actor2;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }



    @Test
    public void testGetTitle() throws Exception {

    }

    @Test
    public void testSetTitle_titel_is_null() throws Exception {
        String test = null;
        Movie movie = new Movie("hallo", director, year, genre, rating, evaluation, seen);
        movie.setTitle(test);

        assertEquals(null, movie.getTitle());
    }


    @Test
    public void testSetTitle_titel_is_not_null() throws Exception {
        String test = "hallo";
        Movie movie = new Movie(null, director, year, genre, rating, evaluation, seen);
        movie.setTitle(test);

        assertEquals(test, movie.getTitle());
    }


}