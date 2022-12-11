package Lesson12_Task;

public class DocumentInvalidException extends Exception {

    private String message;
    public static final String INVALID = "INVALID DOCUMENT NUMBER:";
    public DocumentInvalidException(String message) {
        super(message);
    }

    public DocumentInvalidException() {
    }
}
