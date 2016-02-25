package domain.facade;

import db.OpslagVerbindingInterface;
import domain.Movie;
import domain.factory.DatabaseFactory;
import domain.factory.DatabaseType;
import domain.person.Actor;

import java.util.List;

/**
 * Created by filip on 18/02/2016.
 * <p>
 * Dit is mijn facade klasse.
 * <p>
 * Hier moeten alle methodes gebruikt worden om te linken met andere klassen.
 */
public class VideoBeheer {

    //private List<Movie> movies;
    //private List<Actor> actors;


    private OpslagVerbindingInterface videoBeheerDbFake;
    private DatabaseFactory dbFactory;

    public VideoBeheer() {
        //dbFactory = new DatabaseFactory();

        /*
        Dit is de oude versie, de versie eronder is gemaakt met strategy pattern.
        Door dat in de klasse DatabaseFactory er gewerkt wordt met een create-methode en als type een enum waarde, maken we een nieuw object aan
        door middel van de enum waarde.
        Dus door DatabaseType.FAKE mee te geven als parameter zeg je dat de klasse videoBeheerDbFake moet worden gebruikt.

        Wil je veranderen van klasse, dan verander je het type gewoon, en wordt een andere klasse gebruikt.
        */
        //videoBeheerDbFake = new VideoBeheerDbFake();

        //videoBeheerDbFake = dbFactory.create(DatabaseType.FAKE);

        //static aangeroepen
videoBeheerDbFake = DatabaseFactory.create(DatabaseType.FAKE);

        //this.movies = new ArrayList<Movie>();
        //this.actors = new ArrayList<Actor>();
    }

    public DatabaseFactory getDbFactory() {
        return dbFactory;
    }

    public void setDbFactory(DatabaseFactory dbFactory) {
        this.dbFactory = dbFactory;
    }

    /**
     * Hier komt alles van de klasse Movie
     */

    public List<Movie> getAllMovies() {
            return getVideoBeheerDbFake().getAllMovies();
    }

    /**
     * Hier wordt een lijst opgehaald uit de DB klasse.
     *
     * @return een lijst van alle actors die meespelen in 1 film
     */
    public List<Actor> getAllActorsFromOneMovie(Movie movie) {
        return getVideoBeheerDbFake().getAllActorsFromOneMovie(movie);
    }

    public List<Actor> getAllActors() {
        return getVideoBeheerDbFake().getAllActors();
    }


/* Later Implementeren, is optioneel

    public List<Movie> generateListOfMoviesAlreadySeen() {

        List<Movie> moviesSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen()) {
                moviesSeen.add(movies.get(i));
            }

        }

        return moviesSeen;
    }
*/
    /* Later Implementeren, is optioneel

    public List<Movie> generateListOfMoviesNotSeen() {
        List<Movie> moviesNotSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen() == false) {
                moviesNotSeen.add(movies.get(i));
            }
        }

        return moviesNotSeen;
    }
*/

    /* Later Implementeren, is optioneel

    public List<Movie> getActorfromMovies(Actor actor) {
        return actor.getMoviesPlayedIn();
    }
*/

    /**
     * CRUD ==> create
     */
    public void addMovie(Movie movie) {
        getVideoBeheerDbFake().addMovie(movie);
    }

    /**
     * CRUD ==> read
     */
    public Movie getMovie(String naam, int jaar) {
        return getVideoBeheerDbFake().getMovie(naam, jaar);
    }

    /**
     * CRUD ==> update
     */
    public void updateMovie(Movie movie, Movie oldMovie) {
        getVideoBeheerDbFake().updateMovie(movie, oldMovie);
    }

    /**
     * CRUD ==> delete
     */
    public void deleteMovie(Movie movie) {
        getVideoBeheerDbFake().deleteMovie(movie);
    }

    /**
     * CRUD ==> create
     */
    public void addActor(Actor actor) {
        getVideoBeheerDbFake().addActor(actor);
    }

    /**
     * CRUD ==> create 2
     */
    public void addActor(Actor actor, Movie movie) {
        getVideoBeheerDbFake().addActor(actor, movie);
    }

    /**
     * CRUD ==> read
     */
    public Actor getActor(String voornaam, String familieNaam) {
        return getVideoBeheerDbFake().getActor(voornaam, familieNaam);
    }

    /**
     * CRUD ==> update
     */
    public void updateActor(Actor actor, Actor oldActor) {
        getVideoBeheerDbFake().updateActor(actor, oldActor);
    }

    /**
     * CRUD ==> delete
     */
    public void deleteActor(Actor actor) {
        getVideoBeheerDbFake().deleteActor(actor);

    }


    public OpslagVerbindingInterface getVideoBeheerDbFake() {
        return videoBeheerDbFake;
    }

    public void setVideoBeheerDbFake(OpslagVerbindingInterface videoBeheerDbFake) {
        this.videoBeheerDbFake = videoBeheerDbFake;
    }
}