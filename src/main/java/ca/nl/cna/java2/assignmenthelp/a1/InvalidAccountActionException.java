package ca.nl.cna.java2.assignmenthelp.a1;

public class InvalidAccountActionException extends Exception {

    //TODO Default message
    public static String DEFAULT_MESSAGE = "Invalid account action";


    public InvalidAccountActionException() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidAccountActionException(String message) {
        super(message);
    }

    public InvalidAccountActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAccountActionException(Throwable cause) {
        super(DEFAULT_MESSAGE, cause);
    }


}
