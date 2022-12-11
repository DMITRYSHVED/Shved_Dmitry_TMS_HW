package Lesson11_Task;

public class RegistrationException extends Exception {

    private String message;
    private Throwable cause ;
    public RegistrationException() {
    }

    public RegistrationException(String message) {
        this.message = message;
    }

    public RegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

}
