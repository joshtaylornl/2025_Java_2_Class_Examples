package ca.nl.cna.java2.assignmenthelp.a1;

public class InvalidAccountActionException extends Exception {

    //TODO Default message

    public InvalidAccountActionException(String message) {
        super(message);
    }

    public InvalidAccountActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAccountActionException(Throwable cause) {
        super(cause);
    }

    protected InvalidAccountActionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
