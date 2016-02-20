package helperclasses;

/**
 * Created by filipve on 17/02/2016.
 */
public enum MovieGenre {

    ACTION("Action"),
    HORROR("Horror"),
    COMEDY("Comedy");

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;

    MovieGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return getGenre().toString();
    }
}
