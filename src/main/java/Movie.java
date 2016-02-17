import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipve on 17/02/2016.
 */
public class Movie {

    private String title;
    private String director;
    private String year;
    private int genre;
    private int rating;
    private int evaluation;
    private boolean seen;
    private List<Person> actors;

    public Movie( String title, String director, String year, int genre, int rating, int evaluation, boolean seen ) {
        setTitle ( title );
        setDirector ( director );
        setYear ( year );
        setGenre ( genre );
        setRating ( rating );
        setEvaluation ( evaluation );
        setSeen ( seen );
        this.actors = new ArrayList<Person> ( );
    }

    public List<Person> getActors() {
        return actors;
    }

    public void setActors( List<Person> actors ) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector( String director ) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear( String year ) {
        this.year = year;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre( int genre ) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating( int rating ) {
        this.rating = rating;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation( int evaluation ) {
        this.evaluation = evaluation;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen( boolean seen ) {
        this.seen = seen;
    }

    public String gezienOfNiet()
    {
        return isSeen () ? "Ja" : "Nee";
        // return seen == true dan "Ja" anders "Nee"

    }


}
