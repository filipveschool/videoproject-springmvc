import domain.Movie;
import helperclasses.MovieEvaluation;
import helperclasses.MovieGenre;
import helperclasses.MovieRating;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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


    @Before
    public void setUp() throws Exception {
        title = "The Hobbit 1";
        director = "Peter Jackson";
        year = 2012;
        genre = MovieGenre.ACTION;
        rating = MovieRating.GENERALAUDIENCE;
        evaluation = MovieEvaluation.THREESTARS;
        seen = true;
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
        Movie movie = new Movie(1, "hallo", director, year, genre, rating, evaluation, seen);
        movie.setTitle(test);

        assertEquals(null, movie.getTitle());
    }


    @Test
    public void testSetTitle_titel_is_not_null() throws Exception {
        String test = "hallo";
        Movie movie = new Movie(1, null, director, year, genre, rating, evaluation, seen);
        movie.setTitle(test);

        assertEquals(test, movie.getTitle());
    }

    @Test
    public void testGetDirector() throws Exception {

    }

    @Test
    public void testSetDirector() throws Exception {

    }

    @Test
    public void testGetYear() throws Exception {

    }

    @Test
    public void testSetYear() throws Exception {

    }

    @Test
    public void testGetGenre() throws Exception {

    }

    @Test
    public void testSetGenre() throws Exception {

    }

    @Test
    public void testGetRating() throws Exception {

    }

    @Test
    public void testSetRating() throws Exception {

    }

    @Test
    public void testGetEvaluation() throws Exception {

    }

    @Test
    public void testSetEvaluation() throws Exception {

    }

    @Test
    public void testIsSeen() throws Exception {

    }

    @Test
    public void testSetSeen() throws Exception {

    }

    @Test
    public void testGezienOfNiet() throws Exception {

    }
}