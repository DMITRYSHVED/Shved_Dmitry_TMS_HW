package Lesson10_Task.Task1;

public class NumberCombinationException extends Exception {

    private String message;
    public static final String DESCRIPTION = "НОМЕР ДОКУМЕНТА НАЧИНАЕТСЯ С КОМБИНАЦИИ ЦИФР '555'";

    public NumberCombinationException(String message) {
        super(message);
    }

    public static String getDescription() {
        return DESCRIPTION;
    }
}
