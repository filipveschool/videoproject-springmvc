package db;

import domain.Actor;
import domain.Movie;
import domain.person.Person;

import java.sql.SQLException;
import java.util.*;

/**
 * Created by filip on 18/02/2016.
 */
public class VideoBeheerDbFake {

    //TODO interface maken met alleen methodes, en dan de klassen daaraan linken

    //TODO: db klassen opsplitsen voor actors en movies

    //TODO static maken
           Map<Integer, Movie> beheer = new HashMap<Integer, Movie>();

    public VideoBeheerDbFake(){



    }

    public void addMovie(Movie movie){

        //rekening houden met unieke variabelen voor remove update
        int maxkey = Collections.max(beheer.keySet());

        beheer.put(maxkey+1,movie);

    }

    public void updateMovie(Movie movie){
        beheer.put(movie.getId(),movie);
    }

    public void addActor(Actor Actor,Movie movie){

    List<Actor> movies = movie.getActors();





    }



    public List<Movie> getAllMovies(){
        //return db.getAllMovies();
        List<Movie> lijstfilms = new ArrayList<Movie>(beheer.values());
        return lijstfilms;
    }


}
