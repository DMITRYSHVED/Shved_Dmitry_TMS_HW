package Lesson11_Task;

public class WrongLoginException extends RegistrationException {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
