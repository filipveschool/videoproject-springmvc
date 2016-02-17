package helperclasses;

/**
 * Created by filipve on 17/02/2016.
 */
public enum MovieRating {

    NOTRATED ( "NR" ),
    GENERALAUDIENCE ( "G" ),
    PARENTALGUIDANCE ( "PG" ),
    PGTHIRTEEN ( "PG-13" ),
    RESTRICTED ( "R" ),
    NCSEVENTEEN ( "NC-17" );

    private String rating;

    MovieRating( String rating ) {
        this.rating = rating;

    }
}


class TestExample {

    public static void main( String[] args ) {
        for (MovieRating r : MovieRating.values ()) {
            System.out.println ( "rating value:" + r.name () );
        }
    }

}

