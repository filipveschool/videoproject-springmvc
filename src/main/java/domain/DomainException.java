package domain;

/**
 * Created by filip on 18/02/2016.
 */
public class DomainException extends RuntimeException{

    public DomainException(){

    }

    public DomainException(String message) {
        super(message);
    }

    public DomainException(Throwable exception) {

        super(exception);
        // TODO Auto-generated constructor stub
    }

    public DomainException(String message, Throwable exception) {

        super(message, exception);
        // TODO Auto-generated constructor stub
    }
}
