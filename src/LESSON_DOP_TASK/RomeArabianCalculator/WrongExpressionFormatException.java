package LESSON_DOP_TASK.RomeArabianCalculator;

public class WrongExpressionFormatException extends Exception {

    public WrongExpressionFormatException() {
    }

    public WrongExpressionFormatException(String message) {
        super(message);
    }

    public WrongExpressionFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongExpressionFormatException(Throwable cause) {
        super(cause);
    }
}
