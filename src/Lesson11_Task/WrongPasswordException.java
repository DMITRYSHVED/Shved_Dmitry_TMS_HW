package Lesson11_Task;

public class WrongPasswordException extends RegistrationException {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
