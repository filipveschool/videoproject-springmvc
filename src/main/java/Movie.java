import helperclasses.MovieEvaluation;
import helperclasses.MovieGenre;
import helperclasses.MovieRating;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by filipve on 17/02/2016.
 */
public class Movie {

    private String title;
    private String director;
    private int year;
    private MovieGenre genre;
    private MovieRating rating;
    private MovieEvaluation evaluation;
    private boolean seen;
    private List<Actor> actors;

    //TODO: ID-veld bijhouden voor behoud met databank

    public Movie(String title, String director,
                 int year, MovieGenre genre,
                 MovieRating rating, MovieEvaluation evaluation,
                 boolean seen ) {
        setTitle ( title );
        setDirector ( director );
        setYear ( year );
        setGenre ( genre );
        setRating ( rating );
        setEvaluation ( evaluation );
        setSeen ( seen );
        this.actors = new ArrayList<Actor> ( );
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors( List<Actor> actors ) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        if(title == null){
            throw new IllegalArgumentException ( "title cannot be null" );
        }
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector( String director ) {
        this.director = director;
    }

    public int getYear() {
         return year;
    }

    public void setYear( int year ) {
        if( year <= 0) throw new IllegalArgumentException ( "year cannot be 0 or smaller" );
        this.year = year;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre( MovieGenre genre ) {
        this.genre = genre;
    }

    public MovieRating getRating() {
        return rating;
    }

    public void setRating( MovieRating rating ) {
        this.rating = rating;
    }

    public MovieEvaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation( MovieEvaluation evaluation ) {
        if(evaluation == null){
            throw new IllegalArgumentException ( "MovieEvaluation cannot be empty" );
        }
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
