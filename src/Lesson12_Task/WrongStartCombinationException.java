package Lesson12_Task;

public class WrongStartCombinationException extends DocumentInvalidException {

    public static final String DESCRIPTION = "<WRONG DOCUMENT START COMBINATION>";

    public WrongStartCombinationException(String message) {
        super(message);
    }

    public WrongStartCombinationException() {
    }
}
