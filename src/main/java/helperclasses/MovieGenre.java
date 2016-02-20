package helperclasses;

/**
 * Created by filipve on 17/02/2016.
 */
public enum MovieGenre {

    ACTION("Action"),
    HORROR("Horror"),
    COMEDY("Comedy");

    private String genre;

    MovieGenre(String genre) {
        this.genre = genre;
    }
}
