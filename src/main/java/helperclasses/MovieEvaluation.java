package helperclasses;

/**
 * Created by filipve on 17/02/2016.
 */
public enum MovieEvaluation {

    ONESTAR("*"),
    TWOSTARS("**"),
    THREESTARS("***"),
    FOURSTARS("****"),
    FIVESTARS("*****");

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;

    MovieEvaluation(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return getRating().toString();
    }
}
