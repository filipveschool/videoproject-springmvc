package db;

/**
 * Created by filip on 18/02/2016.
 */
public class DBException extends RuntimeException {

    public DBException() {

    }

    public DBException(String message) {

        super(message);
        // TODO Auto-generated constructor stub
    }

    public DBException(Throwable exception) {

        super(exception);
        // TODO Auto-generated constructor stub
    }

    public DBException(String message, Throwable exception) {

        super(message, exception);
        // TODO Auto-generated constructor stub
    }

}
