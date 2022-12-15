package Lesson12_Task;


public class WrongDocumentLengthException extends DocumentInvalidException {

    public static final String DESCRIPTION = "<WRONG DOCUMENT LENGTH>";
    public WrongDocumentLengthException(String message) {
        super(message);
    }

    public WrongDocumentLengthException() {
    }
}
