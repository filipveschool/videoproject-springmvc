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

    private String rating;

    MovieEvaluation( String rating ) {
        this.rating = rating;
    }
}
