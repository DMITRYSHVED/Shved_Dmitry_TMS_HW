package Lesson11_Task;

public class RegistrationException extends Exception {

    private String message;

    public RegistrationException() {
    }

    public RegistrationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
